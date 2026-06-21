from io import TextIOWrapper
from os import getcwd, listdir, system
from os.path import getsize
from json import JSONDecodeError, loads, dumps
from typing import IO, Any, Dict, List, Self, Tuple
from time import time
import zipfile

JavaType = str | List['JavaType'] | None
JsonValue = str | int | float | bool | Dict[str, 'JsonValue'] | List['JsonValue']
JavaFields = Dict[str, JavaType]

# Make field names not start with capital letter

def commonJavaType(a: JavaType, b: JavaType) -> JavaType | bool:
    if a == b: return a
    if isNone(a): return b
    if isNone(b): return a
    shared = [a, b]
    if "Integer" in shared and "Long" in shared:
        return "Long"
    if "Double" in shared and ("Integer" in shared or "Long" in shared):
        return "Double"
    return False

# warnings = set()

class JavaClass:
    name: str
    fields: JavaFields
    def __init__(self, name: str, fields: JavaFields):
        self.name = name
        self.fields = fields

    def equivalent(self, other: Self) -> bool:
        """
        Checks if self and other are equivalent and updates self if they are
        """
        newFields: JavaFields = dict()

        for fieldName in frozenset(self.fields.keys()).union(other.fields.keys()):
            fieldType = self.fields.get(fieldName)
            fieldType2 = other.fields.get(fieldName)

            if self.name != other.name and (fieldType is None or fieldType2 is None):
                return False
            
            newType = commonJavaType(fieldType, fieldType2)
            if (type(newType) == bool):
                if self.name == other.name:
                    # warnings.add((fieldName, frozenset({str(fieldType), str(fieldType2)})))
                    newType = "String"
                else:
                    return False
            
            newFields[fieldName] = newType
            
        self.fields = newFields
        return True

def isNone(item: JavaType) -> bool:
    if item is None: return True
    if type(item) == list:
        if len(item) == 0: return True
        return isNone(item[0])
    return False

def fixName(name: str) -> str:
    name = name[0].lower() + name[1:]
    match name:
        case "class": return "clazz"
        case "new": return "nuw"
        case "protected": return "protec"
        case "package": return "packag"
        case "interface": return "interfac"
    
    for c in " -/_":
        while (idx := name.find(c)) != -1:
            name = name[:idx] + name[idx + 1].upper() + name[idx + 2:]
    
    return name

def capitalize(s: str) -> str:
    return s[0].upper() + s[1:]


def jsonToJavaType(fieldName: str, jsonValue: JsonValue, classes: List[JavaClass]) -> JavaType:
    match jsonValue:
        case bool():
            return "Boolean"
        case str():
            return "String"
        case int():
            if jsonValue > 2_147_483_647 or jsonValue < -2_147_483_648:
                return "Long"
            return "Integer"
        case float():
            return "Double"
        case list():
            if len(jsonValue) == 0:
                return []
            return [jsonToJavaType(fieldName, jsonValue[0], classes)]
        case dict():
            newClass = JavaClass(capitalize(fixName(fieldName)), {k: jsonToJavaType(k, v, classes) for k, v in jsonValue.items()})

            for c in classes:
                if c.equivalent(newClass):
                    return c.name

            while any(c.name == newClass.name for c in classes):
                newClass.name += "I"
            
            classes.append(newClass)
            return newClass.name
        case _:
            return None

def listTypeToJavaStr(typ: List[JavaType]) -> str:
    # Void is replaced with String because Void causes issues in Fory
    _typ: JavaType = typ
    i = 0
    while type(_typ) == list:
        if len(_typ) == 0:
            i += 1
            return "List<" * i + "String" + ">" * i
        _typ = _typ[0]
        i += 1
        if _typ is None:
            return "List<" * i + "String" + ">" * i
    if type(_typ) != str: raise Exception("Unreachable")
    return "List<" * i + _typ + ">" * i

def outputClass(fh: TextIOWrapper, clazz: JavaClass, depth=1):
    fh.write(f"class {clazz.name} " + "{\n")
    for name, typ in clazz.fields.items():
        if (newName := fixName(name)) != name:
            fh.write("\t" * depth + f'@SerializedName("{name}")\n')
            name = newName
        fh.write("\t" * depth + f"@Nullable\n")
        match typ:
            case str():
                pass
            case list():
                typ = listTypeToJavaStr(typ)
                if type(typ) == list: raise Exception("Unreachable")
            case _:
                typ = "String"
        
        fh.write("\t" * depth + f"public {typ} {name};\n")
        fh.write("\t" * depth + f"public {typ} get{capitalize(name)}() " + "{ " + f"return {name}" + "; }\n")
        fh.write("\t" * depth + f"public void set{capitalize(name)}({typ} {name})" + "{ " + f"this.{name} = {name}" "; }\n")

def javaTypeToCapnp(javaType: JavaType) -> str:
    # void/null is replaced with Text/String because the Void class causes issues with Fory
    match javaType:
        case "String":
            return "Text"
        case "Boolean":
            return "Bool"
        case "Integer":
            return "Int32"
        case "Long":
            return "Int64"
        case "Double":
            return "Float64"
        case str():
            return javaType
        case list():
            if len(javaType) > 0:
                return f"List({javaTypeToCapnp(javaType[0])})"
            return "List(Text)"
    return "Text"

def outputCapnp(fh: TextIOWrapper, clazz: JavaClass, depth=1):
    fh.write("\t" * (depth - 1) + f"struct {clazz.name}" + " {\n")

    i = 0
    for name, typ in clazz.fields.items():
        name = fixName(name) or name
        fh.write("\t" * depth + f"{name} @{i} :{javaTypeToCapnp(typ)};\n")
        i += 1

def h(n: int, width: int) -> str:
    return hex(n)[2:].zfill(width)

rootDir = getcwd()
rootDirWSL = "/mnt/" + rootDir[0].lower() + rootDir[2:].replace("\\", "/")

i = 0
with zipfile.ZipFile("Datasets.zip") as datasets:
    for fileInfo in datasets.filelist:
        if fileInfo.is_dir(): continue
        filename = fileInfo.filename
        if not filename.endswith(".jsonlist"): continue

        className = capitalize(filename.split('/')[-1].split('_', 1)[0])

        print(f"file: {filename}")

        fields = dict()
        clazz = None
        classes = []
        fileSize = fileInfo.file_size

        lineNr = 0
        prevTime = None
        prevPos = 0
        with datasets.open(filename) as fh:
            while len(fields) == 0 or any(isNone(v) for v in fields.values()):
                if (lineNr & 0xff) == 0:
                    pos = fh.tell()
                    newTime = time()
                    progress = pos / fileSize
                    percentage = progress * 100
                    dt = (newTime - prevTime) if prevTime else None
                    dp = pos - prevPos
                    bytesLeft = fileSize - pos
                    eta = int(bytesLeft * dt) // dp if dt else 0
                    etaM = str(eta // 60).zfill(2)
                    etaS = str(eta % 60).zfill(2)
                    prevTime = newTime
                    prevPos = pos
                    print(f"{round(percentage, 1)}% {etaM}:{etaS} left", end="\r")
                lineNr += 1
                line = fh.readline()
                if line == b"": break
                if line.isspace(): continue
                
                currentFields = dict()
                currentClass = JavaClass(className, currentFields)

                try:
                    lineDeserialized: Dict[str, JsonValue] = loads(line)
                except JSONDecodeError:
                    print(f"Error at {filename}:{lineNr}")
                    print(line)
                    exit()
                    continue

                if type(lineDeserialized) != dict:
                    print(f"{filename}:{lineNr} was {type(lineDeserialized)} instead of dict")
                    continue
                
                for fieldName, fieldValue in lineDeserialized.items():
                    if fieldName not in currentFields or isNone(currentFields[fieldName]):
                        currentFields[fieldName] = jsonToJavaType(fieldName, fieldValue, classes)
                
                if clazz is None:
                    clazz = currentClass
                    continue

                if not clazz.equivalent(currentClass):
                    print("Core unmatched")
                    exit()

        if clazz is None: raise Exception("Unreachable")

        
        with open(f"src/main/java/eu/hippix/bsctest/data/java/{className}.java", "w+") as fh:
            fh.write("package eu.hippix.bsctest.data.java;\n\nimport java.util.List;\nimport java.lang.Integer;\nimport java.lang.Double;\nimport com.google.gson.annotations.SerializedName;\nimport org.apache.fory.annotation.Nullable;\n\n")
            fh.write("public ")
            outputClass(fh, clazz)
            for innerClass in classes:
                fh.write("\tpublic static ")
                outputClass(fh, innerClass)
                fh.write("\t}\n")
            fh.write("}\n")

        with open(f"src/main/java/eu/hippix/bsctest/data/capnp/{className}.capnp", "w+") as fh:
            fh.write(f'@0xd6317da5058119{h(i, 2)};\nusing Java = import "java.capnp";\n$Java.package("eu.hippix.bsctest.data.capnp");\n$Java.outerClassname("{className}Capnp");\n')
            outputCapnp(fh, clazz)
            for innerClass in classes:
                outputCapnp(fh, innerClass, 2)
                fh.write("\t}\n")
            fh.write("}\n")

        system(f"wsl --cd {rootDir}/src/main/java/eu/hippix/bsctest/data/capnp capnp compile -ojava {className}.capnp")
        system(f"wsl --cd {rootDir}/src/main/java/eu/hippix/bsctest/data/capnp capnp compile -o/bin/cat {className}.capnp > {rootDir}/src/main/resources/eu/hippix/bsctest/data/capnp/{className}.capnp.bin")

        with open(f"src/main/java/eu/hippix/bsctest/data/capnp/{className}Capnp.java", "rb+") as fh:
            byte_offset = 0
            for line in fh:
                if (line_index := line.find(b"public static final org.capnproto.SegmentReader")) >= 0:
                    byte_offset += line_index
                    break
                byte_offset += len(line)
            
            fh.seek(byte_offset + 66)
            fh.truncate()
            fh.write(
b""" = loadSchema();

private static org.capnproto.SegmentReader loadSchema() {
  try (java.io.InputStream is = BestbuyCapnp.class.getResourceAsStream("/eu/hippix/bsctest/data/capnp/bestbuy.capnp.bin")) {
    byte[] bytes = is.readAllBytes();
    java.nio.ByteBuffer buf = java.nio.ByteBuffer.wrap(bytes);
    return new org.capnproto.SegmentReader(buf, null);
  } catch (java.io.IOException e) {
    throw new RuntimeException("Failed to load schema", e);
  }
}}}
""")

        i += 1

        # for w in warnings:
            # print(f"{w[0]} = " + " | ".join(w[1]))
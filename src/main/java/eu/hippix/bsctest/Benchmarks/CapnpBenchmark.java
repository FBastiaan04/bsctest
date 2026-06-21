package eu.hippix.bsctest.Benchmarks;

import eu.hippix.bsctest.AbstractBenchmark;
import eu.hippix.bsctest.BenchmarkState;
import eu.hippix.bsctest.data.capnp.BestbuyCapnp;
import org.capnproto.*;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.io.IOException;
import java.lang.Void;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO: fix deserialization (don't init to default value on `null`)

@State(Scope.Benchmark)
public class CapnpBenchmark extends AbstractBenchmark<ByteBuffer[]> {

    private FieldAccessor root;
    private StructFactory<?, ?> capnpFactory;
    private Class<?> rootBuilderClass;
    private static final MethodHandles.Lookup lookup = MethodHandles.lookup();

    // Deals with recursive classes
    private final Map<Class<?>, FieldAccessor> foundClasses = new HashMap<>();

    @Override
    public void setup(BenchmarkState<ByteBuffer[]> state) throws IOException {
        Class<?> objectClass = state.getObjectClass();
        String benchmarkName = objectClass.getSimpleName();
        try {
            capnpFactory = (StructFactory<?, ?>) Class.forName("eu.hippix.bsctest.data.capnp." + benchmarkName + "Capnp$" + benchmarkName).getField("factory").get(null);
            rootBuilderClass = Class.forName("eu.hippix.bsctest.data.capnp." + benchmarkName + "Capnp$" + benchmarkName + "$Builder");
            Class<?> rootReaderClass = Class.forName("eu.hippix.bsctest.data.capnp." + benchmarkName + "Capnp$" + benchmarkName + "$Reader");
            root = new FieldAccessor(null, null, null, null, objectClass, rootBuilderClass, rootReaderClass, 0);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ByteBuffer[] serializeItem(Object item) {
        MessageBuilder message = new MessageBuilder();

        try {
            root.serialize(item, message.initRoot(capnpFactory));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        return message.getSegmentsForOutput();
    }

    @Override
    protected long serialisedSize(ByteBuffer[] encodedItem) {
        int result = 0;
        for (var part : encodedItem) {
            result += part.position();
        }
        return result;
    }

    @Override
    public Object deserializeItem(ByteBuffer[] serializedItem, Class<?> objectType) {
        MessageReader reader = new MessageReader(serializedItem, ReaderOptions.DEFAULT_READER_OPTIONS);
        try {
            return root.deserialize(reader.getRoot(capnpFactory));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public class FieldAccessor {
        public VarHandle sourceField;
        public MethodHandle capnpSetter;
        public MethodHandle capnpGetter;
        public MethodHandle capnpChecker;
        public MethodHandle constructor;
        public List<FieldAccessor> fieldAccessors;

        public FieldAccessor(VarHandle _sourceField, MethodHandle _capnpSetter, MethodHandle _capnpGetter, MethodHandle _capnpChecker, Class<?> clazz, Class<?> builderClass, Class<?> readerClass, int recDepth) throws Throwable {
            sourceField = _sourceField;
            capnpSetter = _capnpSetter;
            capnpGetter = _capnpGetter;
            capnpChecker = _capnpChecker;
            if (clazz == null) return;
            var existingEntry = foundClasses.get(clazz);
            if (existingEntry != null) {
                constructor = existingEntry.constructor;
                fieldAccessors = existingEntry.fieldAccessors;
                return;
            }
            constructor = lookup.findConstructor(clazz, MethodType.methodType(void.class));
            foundClasses.put(clazz, this);
            fieldAccessors = new ArrayList<>();
            fillFields(clazz, builderClass, readerClass, recDepth);
        }

        private void fillFields(Class<?> clazz, Class<?> builderClass, Class<?> readerClass, int recDepth) throws Throwable {
            if (builderClass == void.class || builderClass == null) return;

            Field[] fields = clazz.getDeclaredFields();

            for (Field f : fields) {
                Class<?> fieldType = f.getType();

                VarHandle innerSourceField = lookup.in(clazz)
                        .unreflectVarHandle(f);

                String capName = capitalize(f.getName());

                MethodHandle innerInitializer = null;
                Class<?> innerBuilder = null;
                Class<?> innerReader = null;

                if (fieldType == List.class) {
                    Type innerFieldType = f.getGenericType();
                    innerInitializer = lookup.unreflect(builderClass.getMethod("init" + capName, int.class));
                    do {
                        innerFieldType = ((ParameterizedType)innerFieldType).getActualTypeArguments()[0];
                    } while (innerFieldType.getClass() != Class.class);

                    fieldType = (Class<?>)innerFieldType;
                }

                if (fieldType == Void.class) {
                    continue;
                }

                Class<?> primitiveType = null;
                if (fieldType == Boolean.class) {
                    primitiveType = boolean.class;
                } else if (fieldType == Integer.class) {
                    primitiveType = int.class;
                } else if (fieldType == Long.class) {
                    primitiveType = long.class;
                } else if (fieldType == Double.class) {
                    primitiveType = double.class;
                } else if (fieldType == String.class) { // struct
                    primitiveType = String.class;
                } else {
                    innerBuilder = Class.forName(rootBuilderClass.getDeclaringClass().getName() + "$" + fieldType.getSimpleName() + "$Builder");
                    innerReader = Class.forName(rootBuilderClass.getDeclaringClass().getName() + "$" + fieldType.getSimpleName() + "$Reader");
                }

                if (innerInitializer == null) {
                    innerInitializer = lookup.unreflect(primitiveType == null ?
                            builderClass.getMethod("init" + capName) :
                            builderClass.getMethod("set" + capName, primitiveType));
                }

                MethodHandle innerChecker = null;
                try {
                    innerChecker = lookup.unreflect(readerClass.getMethod("has" + capName));
                } catch (NoSuchMethodException ignored) {}

                fieldAccessors.add(new FieldAccessor(
                        innerSourceField,
                        innerInitializer,
                        lookup.unreflect(readerClass.getMethod("get" + capName)),
                        innerChecker,
                        primitiveType == null ? fieldType : null,
                        innerBuilder,
                        innerReader,
                        recDepth + 1
                ));
            }
        }

        private void serialize(Object item, Object builder) throws Throwable {
            if (fieldAccessors == null) return;
            var fieldIdx = 0;
            for (FieldAccessor acc : fieldAccessors) {
                Object value = acc.sourceField.get(item);
                fieldIdx++;
                switch (value) {
                    case null -> {}
                    case Boolean b -> acc.capnpSetter.invoke(builder, (boolean)b);
                    case Integer i -> acc.capnpSetter.invoke(builder, (int)i);
                    case Long l -> acc.capnpSetter.invoke(builder, (long)l);
                    case Double d -> acc.capnpSetter.invoke(builder, (double)d);
                    case String s -> acc.capnpSetter.invoke(builder, s);
                    case List<?> l -> {
                        ListBuilder subBuilder = (ListBuilder)acc.capnpSetter.invoke(builder, l.size());
                        acc.serializeList(l, subBuilder);
                    }
                    default -> {
                        var fieldStructBuilder = acc.capnpSetter.invoke(builder);
                        acc.serialize(value, fieldStructBuilder);
                    }
                }
            }
        }

        @SuppressWarnings("unchecked")
        private void serializeList(List<?> list, ListBuilder listBuilder) throws Throwable {
            if (list.isEmpty()) return;
            switch (listBuilder) {
                case ListList.Builder<?> listListBuilder -> {
                    var listList = (List<List<?>>)list;
                    for (var i = 0; i < listList.size(); i++) {
                        var innerList = listList.get(i);
                        serializeList(innerList, (ListBuilder)listListBuilder.init(i, innerList.size()));
                    }
                }
                case StructList.Builder<?> structListBuilder -> {
                    for (var i = 0; i < list.size(); i++) {
                        serialize(list.get(i), structListBuilder.get(i));
                    }
                }
                case PrimitiveList.Boolean.Builder primListBuilder -> {
                    var l = (List<Boolean>)list;
                    for (var i = 0; i < l.size(); i++) {
                        primListBuilder.set(i, l.get(i));
                    }
                }
                case PrimitiveList.Int.Builder primListBuilder -> {
                    var l = (List<Integer>)list;
                    for (var i = 0; i < l.size(); i++) {
                        primListBuilder.set(i, l.get(i));
                    }
                }
                case PrimitiveList.Long.Builder primListBuilder -> {
                    var l = (List<Long>)list;
                    for (var i = 0; i < l.size(); i++) {
                        primListBuilder.set(i, l.get(i));
                    }
                }
                case PrimitiveList.Double.Builder primListBuilder -> {
                    var l = (List<Double>)list;
                    for (var i = 0; i < l.size(); i++) {
                        primListBuilder.set(i, l.get(i));
                    }
                }
                case TextList.Builder textListBuilder -> {
                    var l = (List<String>)list;
                    for (var i = 0; i < l.size(); i++) {
                        textListBuilder.set(i, new Text.Reader(l.get(i)));
                    }
                }
                default -> {}
            }
        }

        public void deserializeField(Object result, Object reader) throws Throwable {
            if (capnpChecker != null && !(boolean)capnpChecker.invoke(reader))
                return;
            sourceField.set(result, deserialize(capnpGetter.invoke(reader)));
            BestbuyCapnp.Bestbuy.Reader r0 = null;
        }

        public Object deserialize(Object capnpValue) throws Throwable {
            switch (capnpValue) {
                case PrimitiveList.Boolean.Reader listReader -> {
                    List<Object> resultList = new ArrayList<>(listReader.size());
                    for (int i = 0; i < listReader.size(); i++) {
                        resultList.add(deserialize(listReader.get(i)));
                    }
                    return resultList;
                }
                case PrimitiveList.Int.Reader listReader -> {
                    List<Object> resultList = new ArrayList<>(listReader.size());
                    for (int i = 0; i < listReader.size(); i++) {
                        resultList.add(deserialize(listReader.get(i)));
                    }
                    return resultList;
                }
                case PrimitiveList.Long.Reader listReader -> {
                    List<Object> resultList = new ArrayList<>(listReader.size());
                    for (int i = 0; i < listReader.size(); i++) {
                        resultList.add(deserialize(listReader.get(i)));
                    }
                    return resultList;
                }
                case PrimitiveList.Double.Reader listReader -> {
                    List<Object> resultList = new ArrayList<>(listReader.size());
                    for (int i = 0; i < listReader.size(); i++) {
                        resultList.add(deserialize(listReader.get(i)));
                    }
                    return resultList;
                }
                case TextList.Reader listReader -> {
                    List<Object> resultList = new ArrayList<>(listReader.size());
                    for (int i = 0; i < listReader.size(); i++) {
                        resultList.add(deserialize(listReader.get(i)));
                    }
                    return resultList;
                }
                case StructList.Reader<?> listReader -> {
                    List<Object> resultList = new ArrayList<>(listReader.size());
                    for (int i = 0; i < listReader.size(); i++) {
                        resultList.add(deserialize(listReader.get(i)));
                    }
                    return resultList;
                }
                case ListList.Reader<?> listListReader -> {
                    List<Object> resultListList = new ArrayList<>(listListReader.size());
                    for (int i = 0; i < listListReader.size(); i++) {
                        resultListList.add(deserialize(listListReader.get(i)));
                    }
                    return resultListList;
                }
                case StructReader ignored -> {
                    var resultStruct = constructor.invoke();
                    for (var acc : fieldAccessors) {
                        acc.deserializeField(resultStruct, capnpValue);
                    }
                    return resultStruct;
                }
                case Text.Reader textReader -> {
                    return textReader.toString();
                }
                case null -> { return null; }
                default -> { return capnpValue; }
            }
        }
    }

    private static String capitalize(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}

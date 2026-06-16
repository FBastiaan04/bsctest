package eu.hippix.bsctest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.zip.ZipFile;

public class FileReader {
    private static final Gson gson = new GsonBuilder()
        .registerTypeAdapter(Double.class, new DoubleDeserializer())
        .create();

    public static List<Object> readFile(String filename, Class<?> clazz) throws IOException {
        return readFile(filename, clazz, Long.MAX_VALUE);
    }

    public static List<Object> readFile(String filename, Class<?> clazz, long max) throws IOException {
        try (ZipFile zip = new ZipFile("Datasets.zip")) {
            var entries = zip.entries();

            InputStream inputStream = null;

            while (entries.hasMoreElements()) {
                var entry = entries.nextElement();
                if (entry.isDirectory()) continue;
                if (entry.getName().equals(filename)) {
                    inputStream = zip.getInputStream(entry);
                    break;
                }
            }

            if (inputStream == null) {
                throw new IOException("Could not find " + filename + " in zip");
            }

            ArrayList<Object> result = new ArrayList<>();
            Scanner scanner = new Scanner(inputStream);
            int nErrs = 0;
            while (scanner.hasNextLine() && result.size() < max) {
                String line = scanner.nextLine();
                Object item;
                try {
                    item = gson.fromJson(line, clazz);
                } catch (JsonSyntaxException e) {
                    nErrs++;
                    continue;
                }
                if (item != null) {
                    result.add(item);
                }
            }
            System.out.println(nErrs + "/" + result.size());
            return result;
        }
    }
}

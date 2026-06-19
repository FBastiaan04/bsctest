package eu.hippix.bsctest;

import eu.hippix.bsctest.data.java.*;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static eu.hippix.bsctest.FileReader.readFile;

@State(Scope.Benchmark)
public class BenchmarkState<T> {

    @Param({
            "Datasets/bestbuy_small_records_remove.jsonlist",
            "Datasets/google_map_small_records_remove.jsonlist",
            "Datasets/twitter_small_records_remove.jsonlist",
            "Datasets/walmart_small_records_remove.jsonlist",
            "Datasets/wiki_small_records_remove.jsonlist",
    })
    public String filename;

    public List<Object> objectList;
    public List<T> encodedList;
    public Class<?> objectClass;

    public Class<?> getObjectClass() {
        return switch (filename) {
            case "Datasets/bestbuy_small_records_remove.jsonlist" -> Bestbuy.class;
            case "Datasets/google_map_small_records_remove.jsonlist" -> Google.class;
            case "Datasets/twitter_small_records_remove.jsonlist" -> Twitter.class;
            case "Datasets/walmart_small_records_remove.jsonlist" -> Walmart.class;
            case "Datasets/wiki_small_records_remove.jsonlist" -> Wiki.class;
            default -> throw new RuntimeException("No type defined for file " + filename);
        };
    }

    public void prepare(AbstractBenchmark<T> implementation, Class<?> _objectClass) throws IOException {
        objectClass = _objectClass;
        objectList = readFile(filename, objectClass);
        encodedList = new ArrayList<>(objectList.size());

        for (var item : objectList) {
            encodedList.add(implementation.serializeItem(item));
        }

        System.out.println("Prepared");
        implementation.measureBandwidth(this);
    }
}
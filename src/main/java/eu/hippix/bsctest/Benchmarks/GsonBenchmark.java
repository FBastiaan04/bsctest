package eu.hippix.bsctest.Benchmarks;

import com.google.gson.Gson;
import eu.hippix.bsctest.AbstractBenchmark;
import eu.hippix.bsctest.BenchmarkState;
import org.openjdk.jmh.annotations.*;

import java.io.IOException;

@State(Scope.Benchmark)
public class GsonBenchmark extends AbstractBenchmark<String> {
    private Gson gson = null;

    @Setup(Level.Trial)
    public void setup(BenchmarkState<String> state) throws IOException {
        gson = new Gson();
        state.prepare(this, state.getObjectClass());
    }

    @Override
    protected String serializeItem(Object item) {
        return gson.toJson(item);
    }

    @Override
    protected Object deserializeItem(String encodedItem, Class<?> objectType) {
        return gson.fromJson(encodedItem, objectType);
    }

    @Override
    protected long serialisedSize(String encodedItem) {
        return encodedItem.length();
    }
}

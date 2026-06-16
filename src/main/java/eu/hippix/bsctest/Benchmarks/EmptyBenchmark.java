package eu.hippix.bsctest.Benchmarks;

import eu.hippix.bsctest.AbstractBenchmark;
import eu.hippix.bsctest.BenchmarkState;
import org.openjdk.jmh.annotations.*;

import java.io.IOException;

@State(Scope.Benchmark)
public class EmptyBenchmark extends AbstractBenchmark<Object> {

    @Setup(Level.Trial)
    public void setup(BenchmarkState<Object> state) throws IOException {
        state.prepare(this, state.getObjectClass());
    }

    @Override
    protected Object serializeItem(Object item) {
        return item;
    }

    @Override
    protected Object deserializeItem(Object encodedItem, Class<?> objectType) {
        return objectType;
    }

    @Override
    protected long serialisedSize(Object encodedItem) {
        return 0;
    }
}

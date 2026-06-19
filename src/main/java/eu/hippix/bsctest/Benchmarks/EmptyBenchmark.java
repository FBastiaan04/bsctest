package eu.hippix.bsctest.Benchmarks;

import eu.hippix.bsctest.AbstractBenchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class EmptyBenchmark extends AbstractBenchmark<Object> {

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

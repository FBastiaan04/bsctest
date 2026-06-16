package eu.hippix.bsctest;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.List;

public abstract class AbstractBenchmark<T> {
    protected abstract T serializeItem(Object item);
    protected abstract Object deserializeItem(T encodedItem, Class<?> objectType);
    protected abstract long serialisedSize(T encodedItem);

    @Benchmark
    public void benchSerialize(BenchmarkState<T> state, Blackhole bh) {
        List<Object> localList = state.objectList;
        for (var item : localList) {
            bh.consume(serializeItem(item));
        }
    }

    @Benchmark
    public void benchDeserialize(BenchmarkState<T> state, Blackhole bh) {
        List<T> localList = state.encodedList;
        for (var item : localList) {
            bh.consume(deserializeItem(item, state.objectClass));
        }
    }

    public void measureBandwidth(BenchmarkState<T> state) {
        List<Object> localList = state.objectList;
        long totalSize = 0;
        for (var item : localList) {
            totalSize += serialisedSize(serializeItem(item));
        }
        System.out.println("Average size " + totalSize / state.objectList.size() + " bytes");
    }

    @TearDown
    public void teardown(BenchmarkState<T> state) {
        state.objectList.clear();
        state.encodedList.clear();
    }
}
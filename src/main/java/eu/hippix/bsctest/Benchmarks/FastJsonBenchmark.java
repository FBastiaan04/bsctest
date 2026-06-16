package eu.hippix.bsctest.Benchmarks;

import com.alibaba.fastjson2.JSON;
import eu.hippix.bsctest.AbstractBenchmark;
import eu.hippix.bsctest.BenchmarkState;
import org.openjdk.jmh.annotations.*;

import java.io.IOException;

@State(Scope.Benchmark)
public class FastJsonBenchmark extends AbstractBenchmark<byte[]> {

    @Setup(Level.Trial)
    public void setup(BenchmarkState<byte[]> state) throws IOException {
        state.prepare(this, state.getObjectClass());
    }

    @Override
    protected byte[] serializeItem(Object item) {
        return JSON.toJSONBytes(item);
    }

    @Override
    protected Object deserializeItem(byte[] encodedItem, Class<?> objectType) {
        // System.out.println(new String(encodedItem, StandardCharsets.UTF_8));
        return JSON.parseObject(encodedItem, objectType);
    }

    @Override
    protected long serialisedSize(byte[] encodedItem) {
        return encodedItem.length;
    }
}

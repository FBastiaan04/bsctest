package eu.hippix.bsctest.Benchmarks;

import com.alibaba.fastjson2.JSON;
import eu.hippix.bsctest.AbstractBenchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class FastJsonBenchmark extends AbstractBenchmark<byte[]> {

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

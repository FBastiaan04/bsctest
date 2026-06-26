package eu.hippix.bsctest.Benchmarks;

import eu.hippix.bsctest.AbstractBenchmark;
import eu.hippix.bsctest.BenchmarkState;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class ProtoBufBenchmark extends AbstractBenchmark<byte[]> {

    // Reusable buffer to avoid memory allocation overhead during benchmarking
    private LinkedBuffer buffer = null;
    private Schema schema = null;

    @Override
    public void setup(BenchmarkState<byte[]> state) {
        schema = RuntimeSchema.getSchema(state.getObjectClass());
        buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected byte[] serializeItem(Object item) {
        try {
            return ProtostuffIOUtil.toByteArray(item, schema, buffer);
        } finally {
            buffer.clear();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    protected Object deserializeItem(byte[] encodedItem, Class<?> objectType) {
        Object message = schema.newMessage();
        ProtostuffIOUtil.mergeFrom(encodedItem, message, schema);
        return message;
    }

    @Override
    protected long serialisedSize(byte[] encodedItem) {
        return encodedItem.length;
    }
}
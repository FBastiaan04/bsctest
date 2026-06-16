package eu.hippix.bsctest.Benchmarks;

import eu.hippix.bsctest.AbstractBenchmark;
import eu.hippix.bsctest.BenchmarkState;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;
import org.openjdk.jmh.annotations.*;

import java.io.IOException;

@State(Scope.Benchmark)
public class ProtoBufBenchmark extends AbstractBenchmark<byte[]> {

    // Reusable buffer to avoid memory allocation overhead during benchmarking
    private LinkedBuffer buffer = null;
    private Schema schema = null;

    @Setup(Level.Trial)
    public void setup(BenchmarkState<byte[]> state) throws IOException {
        System.out.println("Setup started");
        Class<?> itemClass = state.getObjectClass();
        schema = RuntimeSchema.getSchema(itemClass);
        buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
        state.prepare(this, itemClass);
        System.out.println("Setup done");
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
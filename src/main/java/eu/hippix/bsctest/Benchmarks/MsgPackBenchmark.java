package eu.hippix.bsctest.Benchmarks;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import eu.hippix.bsctest.AbstractBenchmark;
import eu.hippix.bsctest.BenchmarkState;
import org.msgpack.jackson.dataformat.MessagePackFactory;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.io.IOException;

@State(Scope.Benchmark)
public class MsgPackBenchmark extends AbstractBenchmark<byte[]> {

    ObjectMapper objectMapper;

    @Override
    public void setup(BenchmarkState<byte[]> state) throws IOException {
        objectMapper = new ObjectMapper(new MessagePackFactory());
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    @Override
    protected byte[] serializeItem(Object item) {
        try {
            return objectMapper.writeValueAsBytes(item);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected Object deserializeItem(byte[] encodedItem, Class<?> objectType) {
        try {
            return objectMapper.readValue(encodedItem, objectType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected long serialisedSize(byte[] encodedItem) {
        return encodedItem.length;
    }
}

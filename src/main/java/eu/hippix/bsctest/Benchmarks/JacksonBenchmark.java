package eu.hippix.bsctest.Benchmarks;

import eu.hippix.bsctest.AbstractBenchmark;
import eu.hippix.bsctest.BenchmarkState;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.module.blackbird.BlackbirdModule;

@State(Scope.Benchmark)
public class JacksonBenchmark extends AbstractBenchmark<byte[]> {
    ObjectMapper mapper;

    @Override
    public void setup(BenchmarkState<byte[]> state) {
        mapper = JsonMapper.builder()
                .addModule(new BlackbirdModule())
                .build();
    }

    @Override
    protected byte[] serializeItem(Object item) {
        return mapper.writeValueAsBytes(item);
    }

    @Override
    protected Object deserializeItem(byte[] encodedItem, Class<?> objectType) {
        return mapper.readValue(encodedItem, objectType);
    }

    @Override
    protected long serialisedSize(byte[] encodedItem) {
        return encodedItem.length;
    }
}

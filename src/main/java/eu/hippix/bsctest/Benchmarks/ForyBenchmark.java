package eu.hippix.bsctest.Benchmarks;

import eu.hippix.bsctest.AbstractBenchmark;
import eu.hippix.bsctest.BenchmarkState;
import org.apache.fory.Fory;
import org.openjdk.jmh.annotations.*;

import java.io.IOException;

@State(Scope.Benchmark)
public class ForyBenchmark extends AbstractBenchmark<byte[]> {

    private Fory fory;

    @Param({"true", "false"})
    public boolean enableXLang;

    @Setup(Level.Trial)
    public void setup(BenchmarkState<byte[]> state) throws IOException {
        Class<?> objectClass = state.getObjectClass();

        fory = Fory.builder()
                .requireClassRegistration(true)
//                .withClassLoader(objectClass.getClassLoader())
                .withXlang(enableXLang)
                .withCodegen(true)
                .build();

        // ThreadLocalFory lets you register a setup callback per thread
//        fory.registerCallback((f) -> {
        fory.register(objectClass);
        for (var clazz : objectClass.getDeclaredClasses()) {
            fory.register(clazz);
        }
//        });

        state.prepare(this, objectClass);
    }

    @Override
    protected byte[] serializeItem(Object item) {
        return fory.serialize(item);
    }

    @Override
    protected Object deserializeItem(byte[] encodedItem, Class<?> objectType) {
        return fory.deserialize(encodedItem);
    }

    @Override
    protected long serialisedSize(byte[] encodedItem) {
        return encodedItem.length;
    }
}
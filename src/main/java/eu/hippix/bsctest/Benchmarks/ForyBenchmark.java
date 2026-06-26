package eu.hippix.bsctest.Benchmarks;

import eu.hippix.bsctest.AbstractBenchmark;
import eu.hippix.bsctest.BenchmarkState;
import org.apache.fory.Fory;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class ForyBenchmark extends AbstractBenchmark<byte[]> {

    private Fory fory;

    @Param({"true", "false"})
    public boolean enableXLang;

    @Override
    public void setup(BenchmarkState<byte[]> state) {
        Class<?> objectClass = state.getObjectClass();

        fory = Fory.builder()
                .requireClassRegistration(true)
                .withClassLoader(objectClass.getClassLoader())
                .withXlang(enableXLang)
                .withCodegen(true)
                .build();

        fory.register(objectClass);
        for (var clazz : objectClass.getDeclaredClasses()) {
            fory.register(clazz);
        }
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
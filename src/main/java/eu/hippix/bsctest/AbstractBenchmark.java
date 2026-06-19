package eu.hippix.bsctest;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.infra.Blackhole;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractBenchmark<T> {
    protected abstract T serializeItem(Object item);
    protected abstract Object deserializeItem(T encodedItem, Class<?> objectType);
    protected abstract long serialisedSize(T encodedItem);
    protected void setup(BenchmarkState<T> state) throws IOException {}

    @Setup(Level.Trial)
    public void _setup(BenchmarkState<T> state) throws IOException {
        setup(state);
        state.prepare(this, state.getObjectClass());
    }

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
        List<T> localList = state.encodedList;
        long totalSize = 0;
        for (var item : localList) {
            totalSize += serialisedSize(item);
        }
        System.out.println("Average size " + totalSize / state.objectList.size() + " bytes");
    }

    @TearDown(Level.Trial)
    public void teardown(BenchmarkState<T> state) {
        state.objectList.clear();
        state.encodedList.clear();

        // The following is done to prevent JFR overwriting the result of the previous fork
        var jfrOutputDir = new File("./output/jfr/").list();
        assert jfrOutputDir != null;
        for (var jfrOutputSubDirName : jfrOutputDir) {
            if (!jfrOutputSubDirName.startsWith("eu.")) continue;
            var jfrOutputSubDir = new File("./output/jfr/" + jfrOutputSubDirName).list();
            assert jfrOutputSubDir != null;
            if (Arrays.stream(jfrOutputSubDir).noneMatch(("profile.jfr")::equals)) continue;
            var nEntries = jfrOutputSubDir.length;
            var jfrOutputFile = new File("./output/jfr/" + jfrOutputSubDirName + "/profile.jfr");
            jfrOutputFile.renameTo(new File("./output/jfr/" + jfrOutputSubDirName + "/profile" + nEntries + ".jfr"));
        }
    }
}
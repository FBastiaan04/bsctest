package eu.hippix.bsctest;

import eu.hippix.bsctest.Benchmarks.*;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.profile.JavaFlightRecorderProfiler;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;
import java.util.concurrent.TimeUnit;

public class App {
    private static final Class<?>[] benchmarks = {
            FastJsonBenchmark.class,
            EmptyBenchmark.class,
            CapnpBenchmark.class,
            GsonBenchmark.class,
            MsgPackBenchmark.class,
            ProtoBufBenchmark.class,
            ForyBenchmark.class,
    };

    public static void main(String[] args) throws Throwable {
        for (var benchmark : benchmarks) {
            Options opt = new OptionsBuilder()
                    .include(benchmark.getSimpleName())
                    .mode(Mode.AverageTime)
                    .timeUnit(TimeUnit.MICROSECONDS)
                    .warmupIterations(5)
                    .warmupTime(TimeValue.seconds(5))
                    .measurementIterations(5)
                    .measurementTime(TimeValue.seconds(5))
                    .forks(3)
                    .jvmArgsAppend("-Xms16g", "-Xmx16g", "-XX:+UseG1GC")
                    .output("output/"+benchmark.getSimpleName()+".txt")
                    .addProfiler(JavaFlightRecorderProfiler.class)
                    .build();

            new Runner(opt).run();
        }
    }
}

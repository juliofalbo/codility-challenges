package benchmark;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.RunnerException;
import tasks.Task2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Task2Benchmark {

    public static void main(String[] args) throws IOException, RunnerException {
        org.openjdk.jmh.Main.main(args);
    }

    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1, warmups = 1)
    @Benchmark
    public static int benchmarkFirstSolution(){
        int[] ints = { 1, 3, -3 };
        return Task2.firstSolution(ints);
    }

    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1, warmups = 1)
    @Benchmark
    public static int benchmarkSecondSolution(){
        int[] ints = { 1, 3, -3 };
        return Task2.secondSolution(ints);
    }

    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1, warmups = 1)
    @Benchmark
    public static int benchmarkThirdSolution(){
        int[] ints = { 1, 3, -3 };
        return Task2.thirdSolution(ints);
    }

}

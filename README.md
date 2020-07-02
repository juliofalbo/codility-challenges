# Codility Challenges

## Benchmark for Task2
To make a benchmark around performance I'm using [OpenJDK JMH (Java Microbenchmark Harness)](https://openjdk.java.net/projects/code-tools/jmh/).
I'm also using JMH Annotation Processor to facilitate the config so, remember to enable the Annotation Processor of your IDEA.

### IntelliJ
To configure annotation processing in IntelliJ IDEA, use dialog Preferences > Project Settings > Compiler > Annotation Processors.

### Eclipse
To configure annotation processing in Eclipse IDEA, use dialog Properties > Java Compiler > Annotation Processing

### Result
```shell script
# JMH version: 1.21
# VM version: JDK 1.8.0_242, OpenJDK 64-Bit Server VM, 25.242-b20
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations

Result "benchmark.Task2Benchmark.benchmarkFirstSolution":
  117.596 ±(99.9%) 38.853 ns/op [Average]
  (min, avg, max) = (107.886, 117.596, 129.401), stdev = 10.090
  CI (99.9%): [78.743, 156.449] (assumes normal distribution)

Result "benchmark.Task2Benchmark.benchmarkSecondSolution":
  172.139 ±(99.9%) 33.716 ns/op [Average]
  (min, avg, max) = (159.663, 172.139, 181.869), stdev = 8.756
  CI (99.9%): [138.423, 205.855] (assumes normal distribution)

Result "benchmark.Task2Benchmark.benchmarkThirdSolution":
  51.068 ±(99.9%) 20.154 ns/op [Average]
  (min, avg, max) = (45.449, 51.068, 56.155), stdev = 5.234
  CI (99.9%): [30.914, 71.222] (assumes normal distribution)


Benchmark                               Mode  Cnt    Score    Error  Units
Task2Benchmark.benchmarkFirstSolution   avgt    5  117.596 ± 38.853  ns/op
Task2Benchmark.benchmarkSecondSolution  avgt    5  172.139 ± 33.716  ns/op
Task2Benchmark.benchmarkThirdSolution   avgt    5   51.068 ± 20.154  ns/op
```

Note: The Average time for each execution is in Nanoseconds.


#### Contribute
If you know a better and faster way for the solution of Task 2, please, create and issue here or open a PR. Would be really nice to learn new approaches.
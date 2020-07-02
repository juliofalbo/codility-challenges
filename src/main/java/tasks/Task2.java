package tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Task2 {

    private final static int INT_MIN   = -1_000_000_000;
    private final static int INT_MAX   = 1_000_000_000;
    private final static int ARRAY_MIN = 2;
    private final static int ARRAY_MAX = 1_000;

    public static int firstSolution(int[] array) {
        if (array.length < ARRAY_MIN || array.length > ARRAY_MAX) {
            throw new IllegalArgumentException("The array must have between 2 and 100_000 elements");
        }

        Set<Integer> allDivisions = new HashSet<>();
        for (int i = 0; i < array.length - 1; i++) {
            int n = array.length;

            //Bug here, if the first element is incorrect this code will throw an exception
            int currentElement = array[i + 1];
            if (currentElement < INT_MIN || currentElement > INT_MAX) {
                throw new IllegalArgumentException(String.format("The element %s is invalid", currentElement));
            }

            int[] b = Arrays.copyOfRange(array, 0, i + 1);
            int[] c = Arrays.copyOfRange(array, i + 1, n);

            int maxB = Arrays.stream(b)
                             .max()
                             .orElse(0);
            int maxC = Arrays.stream(c)
                             .max()
                             .orElse(0);

            allDivisions.add(Math.abs(maxB - maxC));
        }

        return Collections.max(allDivisions);
    }

    public static int secondSolution(int[] array) {

        if (array.length < ARRAY_MIN || array.length > ARRAY_MAX) {
            throw new IllegalArgumentException(String.format("The array must have between %s and %s elements", ARRAY_MIN, ARRAY_MAX));
        }

        final int arraySize = array.length;

        return IntStream.range(0, arraySize)
                        .map(i -> {
                            int value = array[i];
                            if (value < INT_MIN || value > INT_MAX) {
                                throw new IllegalArgumentException(String.format("The Array contains invalid elements. All elements must be between %s and %s", INT_MIN, INT_MAX));
                            }

                            if (i + 1 == arraySize) {
                                return 0;
                            }

                            int[] b = Arrays.copyOfRange(array, 0, i + 1);
                            int[] c = Arrays.copyOfRange(array, i + 1, arraySize);

                            int maxB = Arrays.stream(b)
                                             .max()
                                             .orElse(0);
                            int maxC = Arrays.stream(c)
                                             .max()
                                             .orElse(0);

                            return Math.abs(maxB - maxC);
                        })
                        .max()
                        .orElse(0);
    }

    public static int thirdSolution(int[] array) {

        if (array.length < ARRAY_MIN || array.length > ARRAY_MAX) {
            throw new IllegalArgumentException("The array must have between 2 and 100_000 elements");
        }

        int arraySize = array.length;

        int biggerDivision = 0;

        for (int i = 0; i < arraySize; i++) {

            int currentElement = array[i];
            if (currentElement < INT_MIN || currentElement > INT_MAX) {
                throw new IllegalArgumentException(String.format("The element %s is invalid", currentElement));
            }

            if (i + 1 == arraySize) {
                continue;
            }

            int[] b = Arrays.copyOfRange(array, 0, i + 1);
            int[] c = Arrays.copyOfRange(array, i + 1, arraySize);

            Arrays.sort(b);
            Arrays.sort(c);

            int maxB = b[b.length-1];
            int maxC = c[c.length-1];

            int division = Math.abs(maxB - maxC);
            if(division > biggerDivision){
                biggerDivision = division;
            }
        }

        return biggerDivision;
    }

}

package tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Task2Tests {

    @Test
    public void testSolutionsWith3ints(){
        int[] array = {1, 3 ,-3};
        Assertions.assertEquals(6, Task2.firstSolution(array));
        Assertions.assertEquals(6, Task2.secondSolution(array));
        Assertions.assertEquals(6, Task2.thirdSolution(array));
    }

    @Test
    public void testSolutionsWith6ints(){
        int[] array = { 4, 3, 2, 5, 1 ,1 };
        Assertions.assertEquals(4, Task2.firstSolution(array));
        Assertions.assertEquals(4, Task2.secondSolution(array));
        Assertions.assertEquals(4, Task2.thirdSolution(array));
    }

    @Test
    @Disabled
    public void bugInFirstSolution(){
        int[] array = {2000000000, 3 ,-3};
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.firstSolution(array));
    }

    @Test
    public void testingIllegalIntInFirstPositionOfArray(){
        int[] array = {2000000000, 3 ,-3};
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.secondSolution(array));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.thirdSolution(array));
    }

    @Test
    public void testingIllegalIntInLastPositionOfArray(){
        int[] array = {5, 3, 2000000000};
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.firstSolution(array));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.secondSolution(array));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.thirdSolution(array));
    }

    @Test
    public void testingIllegalIntInAnyPositionOfArray(){
        int[] array = {5, -2000000000, 3 ,-3};
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.firstSolution(array));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.secondSolution(array));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.thirdSolution(array));
    }

    @Test
    public void testingEmptyArrays(){
        int[] array = {};
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.firstSolution(array));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.secondSolution(array));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.thirdSolution(array));
    }

    @Test
    public void testingInvalidArrays(){
        int[] array = {1};
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.firstSolution(array));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.secondSolution(array));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.thirdSolution(array));
    }

    @Test
    public void testSolutionsWith4ints(){
        int[] array = { 0, 1, 77, 55 };
        Assertions.assertEquals(77, Task2.firstSolution(array));
        Assertions.assertEquals(77, Task2.secondSolution(array));
        Assertions.assertEquals(77, Task2.thirdSolution(array));
    }

    @Test
    public void testSolutionsWithAValue0(){
        int[] array = { 0, 10239418 };
        Assertions.assertEquals(10239418, Task2.firstSolution(array));
        Assertions.assertEquals(10239418, Task2.secondSolution(array));
        Assertions.assertEquals(10239418, Task2.thirdSolution(array));
    }

    @Test
    public void testSolutionsWith2ints(){
        int[] array = { 2, 5, 10239418 };
        Assertions.assertEquals(10239416, Task2.firstSolution(array));
        Assertions.assertEquals(10239416, Task2.secondSolution(array));
        Assertions.assertEquals(10239416, Task2.thirdSolution(array));
    }
}

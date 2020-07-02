package tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Task1Tests {

    @Test
    public void testSolution(){
        Assertions.assertEquals(3, Task1.countBitOfMultiplication(3, 7));
        Assertions.assertEquals(6, Task1.countBitOfMultiplication(55, 99));
        Assertions.assertEquals(0, Task1.countBitOfMultiplication(0, 1));
        Assertions.assertEquals(0, Task1.countBitOfMultiplication(0, 0));
        Assertions.assertEquals(1, Task1.countBitOfMultiplication(1, 1));
    }

    @Test
    public void testingIllegalIntPositiveValue(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task1.countBitOfMultiplication(1, 100_000_001));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task1.countBitOfMultiplication(200_000_000, 0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task1.countBitOfMultiplication(200_000_000, 100_000_001));
    }

    @Test
    public void testingIllegalNegativeInt(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task1.countBitOfMultiplication(1, -5));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task1.countBitOfMultiplication(-1, -5));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task1.countBitOfMultiplication(-1, 5));
    }

}

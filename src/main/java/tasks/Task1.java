package tasks;

public class Task1 {

    public static int countBitOfMultiplication(int a, int b){
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("A and B must be non-negative integers");
        } else if (a > 100_000_000 || b > 100_000_000){
            throw new IllegalArgumentException("A and B must be lower than 100,000,000");
        }

        int result = a * b;
        System.out.println(Integer.toBinaryString(result));

        return Integer.bitCount(result);
    }

}

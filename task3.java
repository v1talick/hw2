import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] fibonacciNums = new int[19];
        fibonacciNums[0] = fibonacciNums[1] = 1;

        for (int i = 2; i < fibonacciNums.length; i++) {
            fibonacciNums[i] = fibonacciNums[i - 1] + fibonacciNums[i - 2];
        }

        for (int i = 0; i < fibonacciNums.length; i++) {
            System.out.println(fibonacciNums[i]);
        }
    }
}

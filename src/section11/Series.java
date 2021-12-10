package section11;

import java.util.ArrayList;
import java.util.List;

public class Series {
    private int n;

    public Series(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public static int nSum(int n) {
        if (n < 0) {
            System.out.println("Enter a positive number");
            return -1;
        } else {
            int nSumResult = 0;
            for (int i = 0; i <= n; i++) {
                nSumResult += i;
            }
            return nSumResult;
        }
    }

    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Enter a positive number");
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            int factorialResult = 1;
            for (int i = 1; i <= n; i++) {
                factorialResult *= i;
            }
            return factorialResult;
        }
    }

    public static int fibonacci(int n) {
        List<Integer> fibonacciSequence = new ArrayList<>();
        if (n < 0) {
            System.out.println("Enter a positive number");
            return -1;
        } else {
            fibonacciSequence.add(0);
            fibonacciSequence.add(1);
            if (n == 0 || n == 1) {
                return fibonacciSequence.get(n);
            } else {
                for (int i=2; i<=n; i++) {
                    int currentItem = fibonacciSequence.get(i-1);
                    int previousItem = fibonacciSequence.get(i-2);
                    int newItem = currentItem + previousItem;
                    fibonacciSequence.add(i, newItem);
                }
            }
            System.out.println(fibonacciSequence);
            return fibonacciSequence.get(n);
        }
    }
}

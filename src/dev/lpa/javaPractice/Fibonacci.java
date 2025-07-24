package dev.lpa.javaPractice;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacciSimple(10);
    }

    public static int fibonacciSimple(int n) {

        int a = 0;
        int b = 1;
        System.out.printf("%d %d ", a, b);
        for (int i = 2; i < n; i++) {
            int temp = a + b;
            System.out.printf("%d ", temp);
            a = b;
            b = temp;
        }
        return n == 0 ? a : b;
    }
}

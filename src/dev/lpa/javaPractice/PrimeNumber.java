package dev.lpa.javaPractice;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrime = isPrime(32);
        System.out.println("The number is " + (isPrime ? "" : "not ") + "a prime");
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

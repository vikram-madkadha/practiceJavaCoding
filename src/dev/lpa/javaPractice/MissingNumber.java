package dev.lpa.javaPractice;

public class MissingNumber {
    public static void main(String[] args) {
        int missingNumber = findMissingNumber(10, new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10, 11});
        System.out.println("Missing Number: " + missingNumber);
    }

    public static int findMissingNumber(int n, int[] arr) {
        int sumOfNnumbers = n * (n + 1) / 2;
        int sumOfArr = 0;
        if (arr.length != n - 1) {
            throw new IllegalArgumentException("Array should contain n-1 elements.");
        }
        for (int num : arr) {
            sumOfArr += num;
        }

        return sumOfNnumbers - sumOfArr;
    }
}

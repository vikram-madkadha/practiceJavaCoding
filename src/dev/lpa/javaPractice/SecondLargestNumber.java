package dev.lpa.javaPractice;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second largest element is: " + second);
        }

    }
}

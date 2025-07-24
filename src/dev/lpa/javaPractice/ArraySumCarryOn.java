package dev.lpa.javaPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySumCarryOn {
    public static void main(String[] args) {
        // sumCarryOver(new int[]{4,5,7,8,9}, new int[]{7,5,6,8,9});
        manualCarryOver(new int[]{4, 5, 7, 8, 9}, new int[]{7, 5, 6, 8});
        manualCarryOver(new int[]{4, 1, 3, 2, 2}, new int[]{3, 2, 1});

    }

    public static void sumCarryOver(int[] arr1, int[] arr2) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            num1 = num1 * 10 + arr1[i];
            num2 = num2 * 10 + arr2[i];
        }

        int sum = num1 + num2;
        System.out.println(sum);
        int length = String.valueOf(sum).length();
        int[] arr3 = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            arr3[i] = sum % 10;
            sum = sum / 10;
        }
        for (int digits : arr3) {
            System.out.print(digits + " ");
        }
    }

    public static void manualCarryOver(int[] arr1, int[] arr2) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        int maxLength = Math.max(arr1.length, arr2.length) + 1;
        int k = maxLength - 1;
        int[] temp = new int[maxLength];
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? arr1[i] : 0;
            int digit2 = j >= 0 ? arr2[j] : 0;
            int sum = digit1 + digit2 + carry;
            temp[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
        if (temp[0] == 0) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(temp, 1, temp.length)));
        } else {
            System.out.println(Arrays.toString(temp));
        }
    }
}

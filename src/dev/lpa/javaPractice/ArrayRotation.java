package dev.lpa.javaPractice;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
    int[] arr1 = {34,12,10,23,100,32};
    int[] arr2 = {34,12,10,23,100,32};
    int k1=1;
    int k2=3;
    System.out.println("Original Array: "+Arrays.toString(arr1) + " ");
    leftShift(arr1,k1);
        System.out.println("After left shifting Array: "+ Arrays.toString(arr1) + " ");

        System.out.println("Original Array: "+Arrays.toString(arr2) + " ");
        rightShift(arr2,k2);
        System.out.println("After right shifting Array: "+ Arrays.toString(arr2) + " ");
    }

    public static void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void leftShift(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
        reverseArray(arr, 0, n-1);
    }

    public static void rightShift(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
    }
}

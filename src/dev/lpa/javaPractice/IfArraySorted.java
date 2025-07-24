package dev.lpa.javaPractice;

public class IfArraySorted {
    public static void main(String[] args) {
        System.out.println(isSortedArray(new int[]{3, 5, 1}));
        System.out.println(isSortedArray(new int[]{3, 5, 7}));
        System.out.println(isSortedArray(new int[]{7, 5, 1}));

    }

    public static boolean isSortedArray(int[] arr) {
        boolean asc = true, desc = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                asc = false;
            } else if (arr[i] < arr[i + 1]) {
                desc = false;
            }
        }
        return asc || desc;
    }
}

package dev.lpa.javaPractice;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23, 12, 1, 4, 5, 15};
        System.out.println("Original Array: ");
        printSortedArray(arr);

        sortArray(arr);
        System.out.println();

        System.out.println("Sorted Array: ");
        printSortedArray(arr);
    }

    public static void sortArray(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void printSortedArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

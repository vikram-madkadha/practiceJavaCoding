package dev.lpa.javaPractice;

public class SwapWithoutTemp {
    int a, b;

    public SwapWithoutTemp(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static SwapWithoutTemp swapWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new SwapWithoutTemp(a, b);
    }

    public static void main(String[] args) {
        SwapWithoutTemp swapped = swapWithoutTemp(18, 20);
        System.out.println("After swapping a : " + swapped.a + " and b: " + swapped.b);
    }
}

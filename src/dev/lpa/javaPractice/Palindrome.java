package dev.lpa.javaPractice;

public class Palindrome {
    public static void main(String[] args) {
        String testString = " i mad dam i ";
        int testNumber = 13231;

        boolean isPalindrome = isStringPalindrome(testString);
        System.out.println("\"" + testString + "\" is " + (isPalindrome ? "" : "not ") + "a palindrome.");

        boolean isPalindromeWithoutFn = isStringPalindromeWithoutInBuiltMethods(testString);
        System.out.println("(Without built-in methods) \"" + testString + "\" is " + (isPalindromeWithoutFn ? "" : "not ") + "a palindrome.");

        boolean isNumPalindrome = isNumberPalindrome(testNumber);
        System.out.println(testNumber + " is " + (isNumPalindrome ? "" : "not ") + "a palindrome.");
    }

    public static boolean isStringPalindrome(String originalString) {
        originalString = originalString.replaceAll("\\s+", "").toLowerCase();
        String reverseString;
        reverseString = new StringBuilder(originalString).reverse().toString();
        return reverseString.equals(originalString);
    }

    public static boolean isStringPalindromeWithoutInBuiltMethods(String originalString) {
        originalString = originalString.replaceAll("\\s+", "").toLowerCase();
        StringBuilder reverseString = new StringBuilder();
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reverseString.append(originalString.charAt(i));
        }
        return reverseString.toString().equals(originalString);
    }

    public static boolean isNumberPalindrome(int originalNumber) {
        int temp = originalNumber;
        int reverseNumber = 0;
        while (originalNumber > 0) {
            int remainder = originalNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            originalNumber = originalNumber / 10;
        }
        return reverseNumber == temp;
    }
}

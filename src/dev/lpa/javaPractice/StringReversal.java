package dev.lpa.javaPractice;

import java.util.Arrays;

public class StringReversal {
    public static void main(String[] args) {
        String reversedString = charByChar("Yes good & new things");
        System.out.println("Reversed String char by char: " + reversedString);
        String reversedStringByWord = reverseWordByWord("This is one man");
        System.out.println("Reversed string word by word: " + reversedStringByWord);
    }

    public static String charByChar(String str) {
        String[] words = str.split("\\s");
        System.out.println("Original Words: " + Arrays.toString(words));
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }
        return result.toString().trim();
    }

    public static String reverseWordByWord(String str) {
        String[] words = str.split("\\s");
        System.out.println("Original Words: " + Arrays.toString(words));
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }
}

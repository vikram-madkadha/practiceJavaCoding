package dev.lpa.javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        boolean anagram = isAnagram("silent", "liasten");
        System.out.println("The strings are " + (anagram ? "" : "not") + " anagram");

        boolean anagramCon = isAnagramConventional("silent", "listen");
        System.out.println("The strings are " + (anagramCon ? "" : "not") + " anagram");
    }

    //Best complexity
    public static boolean isAnagram(String str1, String str2) {
        int[] freq = new int[26];
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str1 = str1.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramConventional(String str1, String str2) {
        str1 = str1.replaceAll("\\s+", "").trim();
        str2 = str2.replaceAll("\\s+", "").trim();
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1, char2);
    }

}

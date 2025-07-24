package dev.lpa.javaPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String updatedString = removeDuplicate("bandad");
        System.out.println("String after removing duplicate characters: " + updatedString);
    }

    public static String removeDuplicate(String str) {
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }
}

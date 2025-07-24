package dev.lpa.javaPractice;

import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        char ch = firstnonRepeatingCharacter("MynameisAnthony");
        System.out.println("First non repeating character: " + ch);
    }

    public static char firstnonRepeatingCharacter(String str) {
        str = str.replaceAll("\\s+", "").trim().toLowerCase();
        char[] chars = str.toCharArray();
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char ch : chars) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }
}

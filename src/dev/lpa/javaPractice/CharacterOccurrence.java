package dev.lpa.javaPractice;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {
    public static void main(String[] args) {
        charOccurrence("India is great but politics is not.");
    }

    public static void charOccurrence(String str) {
        str = str.replaceAll("\\s+", "").trim();
        char[] charArray = str.toCharArray();
        Map<Character, Integer> countMap = new HashMap<>();
        for (char character : charArray) {
            character = Character.toLowerCase(character);
            countMap.put(character, countMap.getOrDefault(character, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }
}

package dev.lpa.javaPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {

    public void duplicateCharacters(String str) {
        char[] ch = str.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : ch) {
            if (Character.isWhitespace(c)) {
                continue;
            }
            c = Character.toLowerCase(c);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("'" + entry.getKey() + "' : " + entry.getValue() + "times.");
            }
        }
    }

    public static void duplicateIntArr(int[] arr){
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for(int num: arr){
            if(!seen.add(num)){
                duplicate.add(num);
            }
        }
        System.out.println(duplicate);
    }

    public static void main(String[] args) {
        String str = "Java Programming is very good.";
        DuplicateCharacter dc = new DuplicateCharacter();
        dc.duplicateCharacters(str);
        duplicateIntArr(new int[]{3,5,6,1,2,3,9,3,1,4});
    }
}

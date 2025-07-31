package dev.lpa.regex;

import java.util.regex.Pattern;

public class RegexCharacterClasa {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[xyz]", "abcd"));
        System.out.println(Pattern.matches("[xyz]", "xyz"));
        System.out.println(Pattern.matches("[xyz]", "z"));
        System.out.println(Pattern.matches("[xyz]", "xxxyyzz"));
    }
}

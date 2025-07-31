package dev.lpa.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexOne {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".xx.");
        Matcher matcher = pattern.matcher("sxxn");
        Matcher matcher2 = pattern.matcher("thisisxxandnothing");
        System.out.println("The input provided " + (matcher.matches()?"matches":"does not match") +" the regex pattern.");
        System.out.println("The input provided " + (matcher2.find()?"matches":"does not match") +" the regex pattern.");
    }
}

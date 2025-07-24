package dev.lpa.javaPractice;

import java.util.ArrayList;
import java.util.List;

public class lambda1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Clock", "Block", "Flock", "Dock", "Shock", "Mock"));
        for (String s : list) {
            char fChar = s.charAt(0);
            System.out.println(fChar + " - " + s);
        }
        System.out.println("---------------------------------");
        list.forEach(s -> {
            char fChar = s.charAt(0);
            System.out.println(fChar + " - " + s);
        });

    }
}

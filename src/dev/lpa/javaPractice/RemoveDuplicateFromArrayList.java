package dev.lpa.javaPractice;

import java.util.*;

public class RemoveDuplicateFromArrayList {
    public static void main(String[] args) {
        removeDuplicateFromArrayList(new ArrayList<>(Arrays.asList(3, 4, 6, 1, 8, 2, 1, 5, 3, 9, 8, 2, 1)));
        removeDuplicateFromArrayList(new ArrayList<>(Arrays.asList("This is is not not good".split(" "))));
    }

    public static <T> void removeDuplicateFromArrayList(List<T> list) {
        Set<T> set = new LinkedHashSet<>(list);
        System.out.println("Elements in set: " + set);
        list.clear();
        list.addAll(set);
        System.out.println("Elements in Array List: " + list);
    }
}

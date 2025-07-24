package dev.lpa.genericsextra;


import dev.lpa.util.QueryList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int studentCount=10;
        List<Student> students = new ArrayList<>();
        for(int i=0; i <studentCount; i++){
            students.add(new Student());
        }
        printMoreList(students);

        List<LPAStudent> lpastudents = new ArrayList<>();
        for(int i=0; i <studentCount; i++){
            lpastudents.add(new LPAStudent());
        }
        printMoreList(lpastudents);

        printWildCard(new ArrayList<String>(List.of("Vikram","Deepa","Swati","Betu","Achhi","Rupa")));
        printWildCard(new ArrayList<Integer>(List.of(23,21,90,34,90)));
        var queryList = new QueryList<>(lpastudents);
        var matches = queryList.getMatches(
                "COURSE", "PYTHON");
        var matches1 = queryList.getMatches(
                "COURSE", "JAVA");
        printMoreList(matches);
        printMoreList(matches1);

    }


        public static void printMoreList(List<? extends Student> students){
        for(var student : students){
            System.out.println(student.getYearStarted() + " : "+ student);
        }
        System.out.println();
    }
    public static void printWildCard(List<?> list){
        for(var element: list){
            if(element instanceof String s){
                System.out.println("String: "+s.toUpperCase());
            }else if(element instanceof Integer i){
                System.out.println("Integer: " +i.floatValue());
            }
        }
    }

//    public static <T extends Student> void printList(List<T> students){
//        for(var student : students){
//            System.out.println(student.getYearStarted() + " : "+ student);
//        }
//        System.out.println();
//    }
}

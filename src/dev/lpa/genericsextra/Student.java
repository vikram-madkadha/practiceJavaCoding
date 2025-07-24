package dev.lpa.genericsextra;

import dev.lpa.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem {
    private String name;
    private String course;
    private int yearStarted;
    protected static Random random = new Random(); //protected so that the subclass can access this protected field
    private static String[] firstNames = {"Ann", "Bill", "John", "Cathy","Tim"};
    private static String[] courses = {"C++","Java","Python"};

        public Student(){
        int lastNameIndex = random.nextInt(65,91);
        name = firstNames[random.nextInt(5)] + " " + (char)lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2020,2025);
    }

@Override
    public String toString(){
        return "%-15s %-15s %d".formatted(name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch(fName){
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted ==(Integer.parseInt(value));
            default -> false;
        };
    }

}

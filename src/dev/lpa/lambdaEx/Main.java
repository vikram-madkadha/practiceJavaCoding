package dev.lpa.lambdaEx;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record Person(String firstName, String lastName){
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
List<Person> people = new ArrayList<>(Arrays.asList(
        new Person("Vikram", "Mishra"),
        new Person("Devendra", "Shukla"),
        new Person("Hiroshima", "Nagasaki"),
        new Person("Ratna", "Mehta"),
        new Person("Buchaka", "Osaka")));
//using anonymous class
var comparatorLastName = new Comparator<Person>(){
    @Override
            public int compare(Person o1, Person o2){
        return o1.lastName().compareTo(o2.lastName());
            }
        };
//people.sort(comparatorLastName);
    people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
    //System.out.println(people);
    int result = calculator(Integer::sum,10,5);
    var result2 = calculator((var a, var b)->a-b,10,5);
    var result3 = calculator(String::concat, "Vikram", "Swati");
    var result4 = calculator((Double a, Double b) -> a/b, 120.0, 12.0);

    }

    public static <T> T calculator(Operations<T> function, T value1, T value2){
        T result = function.operates(value1, value2);
        System.out.println("Result of the operartion: " +result);
        return result;
    }
}

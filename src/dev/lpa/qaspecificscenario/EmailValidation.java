package dev.lpa.qaspecificscenario;

import java.util.regex.*;

public class EmailValidation {
    public static void main(String[] args) {
    String[] emails = {"vmadka@gmail.com",
            "v.com",
            "user.name+tag+sorting@example.co.in",
            "invalid-email@",
            "hello@.com",
            "valid_email123@domain.org"};
    for(String email : emails) {
        System.out.println(email + " is " +(isValidEmail(email)?" valid" : " not    valid"));
    }
    }

    public static boolean isValidEmail(String email){
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        if(email == null){
            return false;
        }
        return pattern.matcher(email).matches();
    }
}

package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsingExamples {
    public static void main(String[] args) {

        String numberAsString = "45";
        //converts (parse) string into Integer
        int number = Integer.parseInt(numberAsString);
        int result = number + 1;
        System.out.println(result);

        String userInput = "10/17/2022";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthDay = LocalDate.parse(userInput, formatter);

        System.out.println(birthDay.getDayOfWeek());
    }
}

package com.pluralsight;

import java.util.regex.Pattern;

public class SplitExample {
    public static void main(String[] args) {

        String input = "Dallas|Ft.Worth|Austin";
        String[] cities = input.split(Pattern.quote("|"));
        System.out.println(cities[1]);

        String numberAsString = "45";
        //converts string into Integer
        int number = Integer.parseInt(numberAsString);
        int result = number + 1;
        System.out.println(result);
    }
}

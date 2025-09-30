package com.pluralsight;

public class Escaping {
    public static void main(String[] args) {
        String welcome = "big Text says \"Howdy\"";
        System.out.println(welcome);

        String message = "This is a message. \nIt goes on and on blah, blah, blah.";

        System.out.println(message);

        String message2 = """
                This is a message.
                It goes on and on blah, blah, blah.""";

        System.out.println(message2);
    }
}

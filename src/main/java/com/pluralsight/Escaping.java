package com.pluralsight;

public class Escaping {
    public static void main(String[] args) {
        String welcome = "big Text says \"Howdy\"";
        System.out.println(welcome);

        String message = "This is a message. \nIt goes on and on blah, blah, blah.";

        System.out.println(message);

        String message2 = """
                This is a message.
                It goes on and on blah, blah, blah.
                """;

        System.out.println(message2);

        String fullName = "Dana Wyatt";
        int length = fullName.length();
        System.out.println(length);

        String username = "danaw ";
        username = username.trim();
        System.out.println(username);

        String trackingCode = "USA-12981-Y-22";
        char hasShipped = trackingCode.charAt(10);
        System.out.println(hasShipped);

        int hyphenPosition = trackingCode.indexOf("-");
        System.out.println(hyphenPosition);


    }
}

package com.pluralsight;

public class ClassExample {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setMake("Nissan");
        car1.setModel("Altima");

        System.out.println(car1.getMake() + " " + car1.getModel());

        Car car2 = new Car();
        car2.setMake("Honda");
        car2.setModel("Accord");

        System.out.println(car2.getMake() + " " + car2.getModel());
    }
}

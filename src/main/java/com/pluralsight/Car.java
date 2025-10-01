package com.pluralsight;

public class Car {

    private String make;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public void display() {
        System.out.println(this.getMake() + " " + this.getModel());
    }
}

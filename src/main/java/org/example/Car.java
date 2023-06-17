package org.example;

public class Car {
    private String make;
    private String model;
    private int year;

    private Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
//static factory method
    public static Car createCar(String make, String model, int year) {
        // Validate input arguments
        if (make == null || make.isEmpty() || model == null || model.isEmpty() || year <= 0) {
            throw new IllegalArgumentException("Invalid input arguments");
        }

        // Create and return a new Car object
        return new Car(make, model, year);
    }

    // Getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

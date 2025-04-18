package Basics;


public class Car {
    // Instance variables (specific to each object)
    String color;
    String model;
    int year;

    // Static variable (shared by all objects)
    static int numberOfCars;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
        numberOfCars++; // Increment the number of cars whenever a new object is created
    }

    // Instance method
    public void displayInfo() {
        System.out.println("Car Model: " + model + ", Color: " + color + ", Year: " + year);
    }

    // Static method (can be called without creating an object)
    public static void displayTotalCars() {
        System.out.println("Total cars: " + numberOfCars);
    }
}


package Basics;


//Superclass (Parent Class)
public class Vehicle {
 // Fields
 String brand;
 int year;

 // Constructor
 public Vehicle(String brand, int year) {
     this.brand = brand;
     this.year = year;
 }

 // Method
 public void start() {
     System.out.println("Vehicle is starting...");
 }

 public void stop() {
     System.out.println("Vehicle is stopping...");
 }
}

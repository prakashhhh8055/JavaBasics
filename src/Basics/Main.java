package Basics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Creating objects
		        Car car1 = new Car("Red", "Toyota", 2020);
		        Car car2 = new Car("Blue", "Honda", 2021);

		        // Calling instance methods
		         car1.displayInfo();
		         car2.displayInfo();

		        // Calling static method
		        Car.displayTotalCars(); // We can call it directly using the class name
		    }

	}

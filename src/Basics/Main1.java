package Basics;

public class Main1 {
		public static void main(String[] args) {
		   // Creating an object of the Car class
		   Caar car = new Caar("Toyota", 2020, 4);

		   // Accessing methods from the superclass
		   car.start();  // Calls the overridden method in Car
		   car.stop();   // Calls the method from Vehicle class

		   // Accessing method from subclass
		   car.displayInfo();
		
}
}

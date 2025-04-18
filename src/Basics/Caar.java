package Basics;


//Subclass (Child Class)
public class Caar extends Vehicle {
// Additional field in the subclass
int doors;

// Constructor of subclass
public Caar(String brand, int year, int doors) {
   super(brand, year);  // Call the constructor of the superclass
   this.doors = doors;
}

// Method specific to the subclass
public void displayInfo() {
   System.out.println("Car Brand: " + brand);
   System.out.println("Car Year: " + year);
   System.out.println("Car Doors: " + doors);
}

// Method overriding: Overriding the start method from the superclass
@Override
public void start() {
   System.out.println("Car is starting with a roar...");
}
}


package Basics;


final class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {  // ❌ Error: cannot inherit from final class
    // Not allowed
}


public class finalkeywordwithclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

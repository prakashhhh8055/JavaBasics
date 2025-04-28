package TypeCasting;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void playMusic() {
        System.out.println("Car is playing music");
    }
}

public class TestCasting1 {

	public static void main(String[] args) {
        Vehicle vehicle = new Car();  // upcasting
        vehicle.start();              // OK
        // vehicle.playMusic();       // ❌ not possible now
        
        // Downcasting safely
        Car car = (Car) vehicle;       
        car.start();                  // OK
        car.playMusic();              // OK
        
        // Wrong downcasting example:
        Vehicle v2 = new Vehicle();   
        // Car c2 = (Car) v2;         // ❌ runtime crash if uncommented

	}

}

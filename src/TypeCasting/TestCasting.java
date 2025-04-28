package TypeCasting;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks!");
    }
}

public class TestCasting {
    public static void main(String[] args) {
    	
    	System.out.println("-----------------After Up Casting-----------------");
        Animal animal = new Dog();   // Upcasting
        //After Upcasting	-> You can only use parent class methods (like sound() only)
        animal.sound();              // OK: Animal method
        // animal.bark();            // ❌ NOT OK: Cannot see Dog methods
        System.out.println("-----------------After Down Casting---------------");
        Dog dog = (Dog) animal;       // Downcasting
        // After Downcasting ->	You can use child class methods (like bark())
        dog.sound();                  // OK
        dog.bark();                   // OK: Now we can call Dog methods
    }
}


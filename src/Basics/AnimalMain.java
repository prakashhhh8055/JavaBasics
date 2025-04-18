package Basics;

public class AnimalMain 
{
	    public static void main(String[] args) 
	    {
	    	Animal animal = new Animal();
	        Animal myDog = new Dog();
	        Animal myCat = new Cat();
	        
	        animal.sound();//Animal sound()
	        myDog.sound(); // Calls Dog's sound()
	        myCat.sound(); // Calls Cat's sound()
	    }

}

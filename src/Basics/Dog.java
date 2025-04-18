package Basics;
	

/*Method Overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass.

Method Overriding is resolved at runtime, hence it's known as runtime polymorphism.

Key Points:
The method in the child class must have the same method signature as in the parent class.

The overriding method in the subclass can have a more specific behavior than the parent class method.

Method overriding requires the @Override annotation (optional but recommended). */

	// Subclass
		public class Dog extends Animal
		{
			//Method Overriding
			@Override
		    public void sound() {
		        System.out.println("Bark");
		    }
		}		

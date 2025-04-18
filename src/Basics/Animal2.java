package Basics;

//Interface
interface Animal2 
{
 
	// Abstract method (does not have a body)
	void sound();
 
	// Default method with a body
	default void sleep() 
	{
     System.out.println("This animal is sleeping.");
	}
}


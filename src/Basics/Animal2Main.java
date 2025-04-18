package Basics;

public class Animal2Main 
{
	public static void main(String[] args) 
	{
		Animal2 dog2 = new Dog2(); // Dog object
		dog2.sound();             // Output: Bark
		dog2.sleep();             // Output: This animal is sleeping.
 
		Animal2 cat2 = new Cat2(); // Cat object
		cat2.sound();             // Output: Meow
		cat2.sleep();             // Output: This animal is sleeping.
}
}
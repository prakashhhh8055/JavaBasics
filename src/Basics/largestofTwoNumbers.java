package Basics;

public class largestofTwoNumbers {

	public static void main(String[] args) {
		// Largest of Two Numbers
		
		int a=10, b=5;
		
		if(a>b)
		{
			System.out.println("Largest Number is "+a);
		}
		else
		{
			System.out.println("Largest Number is "+b);
		}
		
		int Largest=(a>b)?a:b;
		System.out.println("Largest Number is "+Largest);

	}

}

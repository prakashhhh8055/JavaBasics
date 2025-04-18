package Basics;

public class smallestOfThreeNumbers {

	public static void main(String[] args) {
		// Find the Smallest of 3 Numbers
		
		int a=80,b=30,c=100;
		
		int res=(a<b)?((a<c)?a:c):(b<c)?b:c;
		System.out.println("Smallest number is "+res);
		
		if(a<b && a<c)
		{
			System.out.println("Smallest number is "+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("Smallest number is "+b);
		}
		else
		{
			System.out.println("Smallest number is "+c);
		}

	}

}

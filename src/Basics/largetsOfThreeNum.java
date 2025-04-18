package Basics;

public class largetsOfThreeNum {

	public static void main(String[] args) {
		/*  Write a Java program to find the largest of three numbers using the ternary operator.
			Input: a = 10, b = 15, c = 8
			Expected Output: The largest number is 15  */
		int a=10, b=15, c=20;
		int largest = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("The largest value is "+largest);
		

	}

}

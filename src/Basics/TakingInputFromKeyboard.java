package Basics;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		// Taking input from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Integer input from keyboard");
		int num=sc.nextInt(); //Read integer Number from input
		System.out.println("Given Number is "+num);
		
		System.out.println("Enter a Decimal input from keyboard");
		double num1=sc.nextDouble(); //Read Decimal from input
		System.out.println("Given Number is "+num1);
		
		System.out.println("Enter a String input from keyboard");
		String num2=sc.next(); //Read Decimal from input
		System.out.println("Given String is "+num2);
		
		

	}

}

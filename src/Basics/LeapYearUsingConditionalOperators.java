package Basics;

public class LeapYearUsingConditionalOperators {

	public static void main(String[] args) {
		/* Task: Write a program that uses conditional (ternary) operators to check if a given year is a leap year.
				A year is a leap year if:
				It is divisible by 4, but not divisible by 100, or
				It is divisible by 400. 
				Input: year = 2024
				Expected Output: 2024 is a leap year */
	
		        int year = 2024;

		        // Using ternary operator to check for leap year
		        String result = (year % 400 == 0) ? "Leap year" :
		                        (year % 100 == 0) ? "Not a leap year" :
		                        (year % 4 == 0) ? "Leap year" : "Not a leap year";

		        System.out.println(year + " is " + result);
		    }
		



	}


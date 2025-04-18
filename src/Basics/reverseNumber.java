package Basics;

public class reverseNumber {

	public static void main(String[] args) {
		/* REVERSE Number
		 * Steps: 1. Take the last digit of the number using the modulus operator (%).
				  2. Multiply the reversed number (initialized as 0) by 10 and add the last digit to it.
				  3. Remove the last digit from the original number using the division operator (/).
				  4. Repeat the process until the number becomes 0. */
		
		int Number=2894;
		int lastdigit;
		int reversed_number=0;
		while(Number!=0)
		{
			lastdigit = Number%10;
			reversed_number = (reversed_number*10)+lastdigit;
			Number=Number/10;
			
		}
		System.out.println(reversed_number);

	}

}

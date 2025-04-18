package Basics;

public class palindrome {

	public static void main(String[] args) {
		// The given Number is Palindrome or Not
		int Number=131;
		int originalNum = Number;
		int lastdigit;
		int reversed_number=0;
		while(Number!=0)
		{
			lastdigit = Number%10;
			reversed_number = (reversed_number*10)+lastdigit;
			Number=Number/10;
		}
		if(originalNum==reversed_number)
		{
			System.out.println("Give Number is Palindrome");
		}
		else
		{
			System.out.println("Give Number is Not a Palindrome");
		}
	}

}

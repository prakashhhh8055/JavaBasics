package Basics;

public class sumOfDigitsOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number=1233311;
		int sumOfDigits=0;
		
		while(Number!=0) {
			int digit=Number%10;
			sumOfDigits+=digit;
			Number=Number/10;
			
		}
		System.out.println("Sum of the Digits "+sumOfDigits);
	}

}

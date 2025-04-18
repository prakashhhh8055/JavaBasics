package Basics;

public class printNumOfOddAndEvenFromGivenNumber {

	public static void main(String[] args) {
		int number = 1212121;  // You can change this number to test other cases
        int evenCount = 0;
        int oddCount = 0;

        // Process each digit of the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit of the number

            if (digit % 2 == 0) {
                evenCount++;  // Increment the even count if the digit is even
            } else {
                oddCount++;   // Increment the odd count if the digit is odd
            }

            number = number / 10;  // Remove the last digit from the number
        }

        // Output the counts of even and odd digits
        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);

}
}

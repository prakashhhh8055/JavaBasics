package Basics;

public class CalculateCompoundInterest {

	public static void main(String[] args) {
		/* Write a Java program to calculate compound interest using the formula:
			𝐴=𝑃(1+𝑟/𝑛)*nt
  	Where: P = Principal amount 
  	r = Annual interest rate (decimal form)
  	n = Number of times the interest is compounded per year
	t = Time in years
	Use arithmetic operators to calculate the compound interest.

	Input: P = 1000, r = 0.05, n = 12, t = 5
	Expected Output: The compound interest is: 276.28 */
     
		// Given values
        double P = 1000;  // Principal amount
        double r = 0.05;  // Annual interest rate (decimal form)
        int n = 12;       // Number of times the interest is compounded per year
        int t = 5;        // Time in years
        
        // Calculate the compound interest
        double A = P * Math.pow(1 + (r / n), n * t);  // Formula for compound interest
        double compoundInterest = A - P;  // Compound interest is the difference between A and P

        // Output the result
        System.out.printf("The compound interest is: %.2f\n", compoundInterest);
		
	}

}

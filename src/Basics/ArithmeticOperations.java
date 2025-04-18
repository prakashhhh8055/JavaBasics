package Basics;

public class ArithmeticOperations {

	public static void main(String[] args) {
		/*  Simple Arithmetic Operations
		 * Input:
				a = 15, b = 4

		Expected Output:
				Sum: 19
				Difference: 11
				Product: 60
				Quotient: 3
				Remainder: 3
		 					*/
		
		int a=15,b=4;
		int res=a+b;
		System.out.println("Sum:"+res);
		res=a-b;
		System.out.println("Difference:"+res);
		res=a*b;
		System.out.println("Product:"+res);
		res=a/b;
		System.out.println("Quotient:"+res);
		res=a%b;
		System.out.println("Remainder:"+res);
		

	}

}

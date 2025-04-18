package Basics;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int a=10,b=20,c;
		
		/c=(a<b)?a:b; //c=10
		a=(b>c)?b:c; //a=20
		b=(c<a)?c:a; //b=10
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);*/

		     /*   int a = 10;
		        int b = 20;

		        // Swap using ternary operator (not a common approach)
		        a = (a != b) ? (a + b - (b = a)) : a;

		        System.out.println("a = " + a);  // Output: a = 20
		        System.out.println("b = " + b);  // Output: b = 10 */
	
		        int a = 10;
		        int b = 20;
		        
		        // Swap using arithmetic operators
		        a = a + b;  // a becomes 30 (10 + 20)
		        b = a - b;  // b becomes 10 (30 - 20)
		        a = a - b;  // a becomes 20 (30 - 10)
		        
		        System.out.println("a = " + a);  // Output: a = 20
		        System.out.println("b = " + b);  // Output: b = 10	

	}

}

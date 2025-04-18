package Basics;

public class PreAndPostIncAndDec {

	public static void main(String[] args) {
		/* Pre/Post Increment and Decrement
		Pre-Increment: 6
		Post-Increment: 6
		Final Value of x: 7
		Pre-Decrement: 4
		Post-Decrement: 4
		Final Value of x: 3 */
		
		int a=5;
		System.out.println("Pre-Increment:"+(++a));
		System.out.println("Pre-Increment:"+(a=a++));
		System.out.println("Final Value of a: "+a);
		System.out.println("Pre-Increment:"+(--a));
		System.out.println("Pre-Increment:"+(a=a--));
		System.out.println("Final Value of a: "+a);
		

	}

}

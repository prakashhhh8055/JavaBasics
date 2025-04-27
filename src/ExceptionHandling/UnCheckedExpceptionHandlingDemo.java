package ExceptionHandling;

import java.util.Scanner;

public class UnCheckedExpceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program is Started");
		
		
		Scanner sc=new Scanner(System.in);
		//Example 1
		/*System.out.println("Eneter a Number");
		int num=sc.nextInt();
		
		try {
			System.out.println(100/num);
		}catch(ArithmeticException e)
		{
			System.out.println("100 Cannont be divided by 0");
		}
		*/
		
		//Example 2
		/*int a[]=new int[5];
		System.out.println("Enter the position between 0-4");
		
		try {
			int position=sc.nextInt();
			System.out.println("Enter the value to insert in the array");
			int value=sc.nextInt();
			a[position]=value;
			System.out.println(a[position]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter the Array postion between 0-4");
		} */
		
		//Example 3
		/*String s="welcome";
		try {
		int n=Integer.parseInt(s);
		}catch(NumberFormatException e)
		{
			System.out.println("Connot Convert Alphbets format String to Integer Format");
		} */
		
		String x=null;
		try {
		x.length();
		}
		catch(NullPointerException e)
		{
			System.out.println("Connot do operations on the null string");
		}
		
		System.out.println("Program completed");
		System.out.println("Program Exited");

	}

}

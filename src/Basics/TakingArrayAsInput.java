package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class TakingArrayAsInput {

	public static void main(String[] args) {
		// Taking Array As Input
		int a[]=new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Array for Input");
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter the value for the Position "+i);
			a[i]=sc.nextInt();
			
		}
		/*for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]+" ");
		}*/
		
		System.out.println("Here is the Array Elements"+Arrays.toString(a)+" ");
	}

}

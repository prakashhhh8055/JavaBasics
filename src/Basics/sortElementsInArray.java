package Basics;

import java.util.Arrays;

public class sortElementsInArray {

	public static void main(String[] args) {
		// Sort elements in Array
		int a[]= {100,300,600,200,400,500};
		System.out.println("Before Sorting Array Elements");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After Sorting Array Elements");
		System.out.println(Arrays.toString(a));
		

	}

}

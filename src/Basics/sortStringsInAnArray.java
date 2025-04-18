package Basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortStringsInAnArray {

	public static void main(String[] args) {
		// Sort Strings in an Array
		
		char a[]= {'Z','D','B','A'};
		System.out.println("Before Sorting Array"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sorting Array"+Arrays.toString(a));
		System.out.println("----------------------------------------------------");
		String s[]= {"Prakash","Ranjeetha","Renuka","Bhagya","Prasada","Siri" };
		System.out.println("Before Sorting Array"+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("After Sorting Array"+Arrays.toString(s));
	}

}

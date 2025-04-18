package Basics;

import java.util.Arrays;

public class CountNumberofWordsinString {

	public static void main(String[] args) {
		// Count Number of Words in String
		
		String a="Hey Hello how are you guys?";
		
		String arr[]=a.split(" ");
		System.out.println("Number of Words in the given String is "+arr.length);
		
		
		String b="Hello, Guys iam   doing good...!     how about  you?";
		System.out.println(b);
		 // Split by one or more spaces (handles multiple spaces too)
		String arr1[]=b.split("\\s+");
		System.out.println("Number of Words in the given String is "+arr1.length);

	}

}

package Basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountOccurenceOfChar {

	public static void main(String[] args) {
		// Count Occurrence of a characters
		
		String s="abcbbacabababslljs";
		char  arr[]=s.toCharArray();
		
		char target[]=Arrays.copyOf(arr, arr.length);
		int count;
		
	for(int j=0;j<s.length();j++)
	{
		count=0;
		for(int i=0;i<s.length();i++)
		{
			if(arr[i]==target[j])
			{
				count++;
			}
		}
		 System.out.println(target[j]+" -> "+count);
	 }
}

}

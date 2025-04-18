package Basics;

public class reverseString {

	public static void main(String[] args) {
		// Reverse String using string methods length() and charAt()
		
		String s="welcome";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
			//System.out.print(rev);
		}
		System.out.print(rev);
		
	}

}

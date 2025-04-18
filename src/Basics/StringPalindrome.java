package Basics;

public class StringPalindrome {

	public static void main(String[] args) {
		//String is palindrom or not
		
		//String s="welcome";
		String s="MADAM";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println(s+" String is a palindrom");
		}
		else
		{
			System.out.println(s+" String is not a palindrom");
		}

	}

}

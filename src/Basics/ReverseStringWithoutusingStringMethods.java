package Basics;

public class ReverseStringWithoutusingStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome";
		String rev="";
		char a[]=s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.print(rev);

	}

}

package Basics;

public class continuetest {

	public static void main(String[] args) {
		// Skip 3, 5 and 9
		
		for(int i=1;i<=10;i++)
		{
			if(i==3||i==5||i==9)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}

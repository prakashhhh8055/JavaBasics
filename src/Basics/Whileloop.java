package Basics;

public class Whileloop {

	public static void main(String[] args) {
		// print even number between 1 to 10
		
		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		i++;
		}
		
		int j=2;
		while(j<=10)
		{
			System.out.println(j);
			j+=2;
		}
		
		System.out.println("---------------------------------");
		int z=1;
		while(z<=10)
		{
			if(z%2==0)
			{
				System.out.println(z+" is Even");
			}
			else
			{
				System.out.println(z+" is Odd");
			}
		z++;	
		}
		
		System.out.println("---------------------------------");
		int x=10;
		while(x>=1)
		{
			if(x%2==0)
			{
				System.out.println(x+" is Even");
			}
			else
			{
				System.out.println(x+" is Odd");
			}
		x--;	
		}
		

	}

}

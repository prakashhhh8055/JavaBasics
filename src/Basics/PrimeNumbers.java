package Basics;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Prime Numbers between 1 to 10");
		for(int i=1;i<10;i++)
		{
			for(int j=2;j<10;j++)
			{
			  if(i!=j && i!=1)
			  {
				 if(i/j==0)
				 {
				  System.out.println(i);
				 }
			  }
		    }
	     }
	}
 }


	



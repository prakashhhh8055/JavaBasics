package Basics;

public class PrintEvenAndOddNumFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int countEven=0;
		int countOdd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				countEven++;
				System.out.println(a[i]+" is a Even Number");
			}
			else
			{
				countOdd++;
				System.out.println(a[i]+" is a Odd Number");
			}
			
		}
		System.out.println("Number of Even Numbers in Give Array is "+countEven);
		System.out.println("Number of Odd Numbers in Give Array is "+countOdd);

	}

}

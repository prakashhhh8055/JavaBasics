package Basics;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// Sum of Elements in an given Array
		int a[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			
			sum+=a[i];
			
		}
		System.out.println("Sum of Elements in an given Array "+sum);
	}

}

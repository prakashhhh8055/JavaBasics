package Basics;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[][]=new int[3][2];
		int a[][]= { {100,200},
				     {300,400},
				     {500,600}};
		

		//Number of rows in an tow Dimensional Array
		System.out.println("Number of rows in an tow Dimensional Array");
		System.out.println(a.length);
		
		//Read any value from two Dimensional array
		System.out.println("Read any value from two Dimensional array");
		System.out.println(a[1][1]);
		
		//count number of column
		System.out.println("Count number of column");
		System.out.println(a[0].length);
		
		//print all the values of an two Dimensional Array
		System.out.println("Print all the values of an two Dimensional Arrayprint all the values of an two Dimensional Array");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		} 
		
		//Enhanced For Loop
		System.out.println("Enhanced For Loop");
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}

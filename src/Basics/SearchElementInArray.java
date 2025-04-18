package Basics;

public class SearchElementInArray {

	public static void main(String[] args) {
		// Search Element in Array
		int a[]= {10,20,30,40,50,60};
		int search_element=50;
		boolean status=false;
		
		//using normal for loop
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.print("Element Found");
				status=true;
				break;
			}
		}*/
		
		//using enhanced for loop
		for(int x:a)
		{
			if(x==search_element)
			{
				System.out.print("Element Found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.print("Element not found");
		}

	}

}

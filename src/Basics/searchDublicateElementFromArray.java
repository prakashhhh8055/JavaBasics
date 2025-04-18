package Basics;

public class searchDublicateElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60,20};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			int temp=a[i];
	
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==temp)
				{
					count++;
				}

			}
			if(count>1)
			{
				System.out.println(temp+" is Repeated "+count);
			}	

		}
		
	}

}

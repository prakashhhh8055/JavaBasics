package Basics;

public class countnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number=1232132331;
		int count=0;
		while(Number!=0)
		{
			Number = Number/10;
			++count;
		}
		System.out.println("The given number count is "+count);
	}

}

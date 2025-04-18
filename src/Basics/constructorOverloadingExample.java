package Basics;

public class constructorOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Box b1=new Box();  //1st constructor overloading
		//Box b1=new Box(20.00);  //3rd constructor overloading
		Box b1=new Box(10.50,12.25,5.50); //2nd constructor overloading
		System.out.println(b1.volume());

	}

}

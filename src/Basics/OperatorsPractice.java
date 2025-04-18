package Basics;

public class OperatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) Arithmetic operators + - * / %

		int a=20, b=10, c=20;

		int result=a+b;
		System.out.println("Sum of a and b is:"+result);
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Diff of a and b is:"+(a-b));
		System.out.println("Multiplication of a and b is:"+(a*b));
		System.out.println("Division of a and b is:"+(a/b));
		System.out.println("Modulo division of a and b is:"+(a%b));
		
		//2) Relational/comparison operators > >=
		// returns boolean value - true/false
		
		System.out.println(a>b); 
		System.out.println(a<b); 
		System.out.println(a>=c);
		System.out.println(a<=b); 
		System.out.println(a==b); 
		System.out.println(a==c); 
		System.out.println(a!=b); 
		System.out.println(a!=c); 
		System.out.println("--------------"); 
		boolean output=a>b;
		System.out.println(output); 
		
		
		//3) Logical operators && || !
		// returns boolean value - true/false
		// works between 2 boolean values
		
	/*	x        y      x&&y    x||y     ǃx      !y
		
		TRUE    TRUE    TRUE    TRUE     FALSE   FALSE
		TRUE    FALSE   FALSE   TRUE     FALSE   TRUE
		FALSE   TRUE    FALSE   TRUE     TRUE    FALSE
		FALSE   FALSE   FALSE   FALSE    TRUE    TRUE   */
		
		boolean x=true;
		boolean y=false;

		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true

		boolean b1=10>20;
		System.out.println(b1); //false

		boolean b2=20>10;
		System.out.println(b2); //true

		System.out.println(b1 && b2); //false
		System.out.println(b1 || b2); //true|
		
		System.out.println("--------------"); 
		System.out.println((100<200) && (200>100)); //true
		System.out.println((100==200) || (200==100)); //false


	}

}

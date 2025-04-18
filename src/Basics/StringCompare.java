package Basics;

public class StringCompare {

	public static void main(String[] args) {
// What is the difference between s1==s2 and s1.equals(s2)
//what is the difference between String s1="Welcome" and String s2=new String("welcome");
		
		
	//case 1
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	//case 2
		String a1=new String("All is well");
		String a2=new String("All is well");
		
		System.out.println(a1==a2);//false //compare objects
		System.out.println(a1.equals(a2)); //true //compare value of the objects
		
	//case 3
		String b1="abc";
		String b2=new String("abc");
		
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		
	//case 4
		String c1="abc";
		String c2=new String("abc");
		String c3=c2;
		
		System.out.println(c1==c2); //false
		System.out.println(c1.equals(c2)); //true
		
		System.out.println(c1==c3); //false
		System.out.println(c1.equals(c2)); //true
		
		System.out.println(c2==c3); //true
		System.out.println(c2.equals(c3)); //true
		
	}

}

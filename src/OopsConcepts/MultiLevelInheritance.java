package OopsConcepts;

class a1
{
 int a;
 void display()
 {
	 System.out.println(a);
 }
}

class b1 extends a1
{
 int b;
 void show()
 {
	 System.out.println(b);
 }
}

class c extends b1
{
 int c;
 void print()
 {
	 System.out.println(c);
 }
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
		c obj=new c();
		obj.a=100;
		obj.b=200;
		obj.c=300;
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println("Addition of a,b and c is "+(obj.a+obj.b+obj.c));
		

	}

}


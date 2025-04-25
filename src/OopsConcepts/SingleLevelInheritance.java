package OopsConcepts;



class a
{
 int a;
 void display()
 {
	 System.out.println(a);
 }
}

class b extends a
{
 int b;
 void show()
 {
	 System.out.println(b);
 }
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		b obj=new b();
		obj.a=100;
		obj.b=200;
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println("Addition of a and b is "+(obj.a+obj.b));
		

	}

}

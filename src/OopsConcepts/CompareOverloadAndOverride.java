package OopsConcepts;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	void m1(int a)
	{
		System.out.println(a*a);
	}
	void m2(int a,int b)
	{
		System.out.println(a*b);
	}
}


public class CompareOverloadAndOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYZ xyz=new XYZ();
		xyz.m1(10);
		xyz.m2(200);
		xyz.m2(30,20);
	}

}

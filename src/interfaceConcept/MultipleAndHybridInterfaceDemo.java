package interfaceConcept;

public class MultipleAndHybridInterfaceDemo extends c1 implements i1,i2  //Achieved Multiple & Hybrid Inheritance here
{
	@Override
	public void m2() 
	{
		System.out.println(x);
		
	}

	@Override
	public void m1() {
		System.out.println(y);
		
	}
	
	public static void main(String[] args) 
	{	
		//Achieved Multiple Inheritance here
		MultipleAndHybridInterfaceDemo obj=new MultipleAndHybridInterfaceDemo();
		obj.m1();
		obj.m2();
		//Achieved Hybrid Inheritance here
		obj.m3();

	}



}

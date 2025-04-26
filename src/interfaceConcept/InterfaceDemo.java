package interfaceConcept;

interface shape
{
	int length=100;
	int width=200;
	
	void circle();
	
	default void square()
	{
		System.out.println("This is the default method");
	}
	
	static void rectangle()
	{
		System.out.println("This is the static method");
	}
}

public class InterfaceDemo implements shape
{
	
	@Override
	public void circle() 
	{
		System.out.println("This is the abstract method");
	}
	
	public static void main(String[] args) {
		// Scenario 1
		InterfaceDemo obj=new InterfaceDemo();
		obj.circle();
		obj.square();
		shape.rectangle();
		System.out.println("-----------------------------------------");
		// Scenario 2
		shape sh=new InterfaceDemo();
		sh.circle();
		sh.square();
		shape.rectangle();

	}



}

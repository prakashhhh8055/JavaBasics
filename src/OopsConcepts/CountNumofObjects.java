package OopsConcepts;

public class CountNumofObjects {
	
	
	static int count=0;
	
	CountNumofObjects()
	{
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountNumofObjects c1=new CountNumofObjects();
		CountNumofObjects c2=new CountNumofObjects();
		CountNumofObjects c3=new CountNumofObjects();
		System.out.print(CountNumofObjects.count);
		

	}

}

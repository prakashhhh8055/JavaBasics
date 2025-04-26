package OopsConcepts;

class Bank
{
 double intrest()
 {
	 return 0.0;
 }
}

class ICICI extends Bank
{
	double intrest()
	{
		 return 10.50;
	 }
}

class SBI extends Bank
{
	double intrest()
	{
		 return 12.50;
	 }
}

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		System.out.println(b.intrest());
		
		ICICI I=new ICICI();
		System.out.println(I.intrest());
		
		SBI sbi=new SBI();
		System.out.println(sbi.intrest());
		

	}

}

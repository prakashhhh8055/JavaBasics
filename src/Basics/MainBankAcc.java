package Basics;

public class MainBankAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAcc c1=new BankAcc();
		c1.setAccNo(1234);
		c1.setBalance(500000);
		c1.setName("Prakash G Malagi");
		
		System.out.println(c1.getAccNo());
		System.out.println(c1.getName());
		System.out.println(c1.getBalance());

	}

}

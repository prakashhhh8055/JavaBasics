package TypeCasting;

class BankAccount {
    void deposit() {
        System.out.println("Depositing money into a Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    void earnInterest() {
        System.out.println("Earning interest in a Savings Account");
    }
}


public class TestCasting2 {

	public static void main(String[] args) {
		BankAccount B=new SavingsAccount();
		B.deposit();
		//B.earnInterest();
		SavingsAccount S=(SavingsAccount) B;
		S.deposit();
		S.earnInterest();
		

	}

}

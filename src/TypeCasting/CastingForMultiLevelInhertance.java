package TypeCasting;


class BankAccount1 {
    void deposit() {
        System.out.println("Depositing money into Bank Account");
    }
}

class SavingsAccount1 extends BankAccount1 {
    void earnInterest() {
        System.out.println("Earning interest in Savings Account");
    }
}

class SeniorCitizenSavingsAccount extends SavingsAccount1 {
    void getExtraBenefits() {
        System.out.println("Getting extra benefits for Senior Citizen");
    }
}

public class CastingForMultiLevelInhertance {
	
	public static void main(String[] args) {
		

	BankAccount1 account = new SeniorCitizenSavingsAccount();   // Upcasting (Level 2 Up)
	SavingsAccount1 savings = new SeniorCitizenSavingsAccount(); // Upcasting (1 Level Up)
	SeniorCitizenSavingsAccount senior = (SeniorCitizenSavingsAccount) account;
	senior.deposit();
	senior.earnInterest();
	senior.getExtraBenefits();
	
	}

	
	
	
	
}

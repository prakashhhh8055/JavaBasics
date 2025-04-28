package TypeCasting;


class Bank_Account {
    void deposit() {
        System.out.println("Depositing money into a Bank Account");
    }
}

class Savings_Account extends Bank_Account {
    void earnInterest() {
        System.out.println("Earning interest in a Savings Account");
    }
}

class CurrentAccount extends Bank_Account {
    void offerOverdraft() {
        System.out.println("Offering overdraft facility in a Current Account");
    }
}

public class CastingBankExample {
    public static void main(String[] args) {
    	Bank_Account account1 = new Savings_Account();   // Upcasting
    	Bank_Account account2 = new CurrentAccount();   // Upcasting
        
        account1.deposit();   // OK
        account2.deposit();   // OK
        
        // Downcasting correctly
        Savings_Account savings = (Savings_Account) account1;
        savings.earnInterest();
        
        CurrentAccount current = (CurrentAccount) account2;
        current.offerOverdraft();
    }
}


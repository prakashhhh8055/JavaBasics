package Basics;

public class MainBank 
{
    public static void main(String[] args) 
    {
        // Creating a BankAccount object with an initial balance of 1000
        BankAccount account = new BankAccount(1000);
        
        // Accessing the balance via getter
        System.out.println("Initial Balance: " + account.getBalance());
        
        // Making a deposit of 500
        account.deposit(500);
        System.out.println("After Deposit: " + account.getBalance());
        
        // Making a withdrawal of 300
        account.withdraw(300);
        System.out.println("After Withdrawal: " + account.getBalance());
        
        // Trying to deposit a negative amount (invalid)
        account.deposit(-100);
        
        // Trying to withdraw more than the balance (invalid)
        account.withdraw(2000);
    }
}


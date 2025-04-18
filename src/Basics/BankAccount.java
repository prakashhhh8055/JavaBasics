package Basics;


//Encapsulation Example in Java
//BankAccount.java
public class BankAccount 
{
	// Private variables (cannot be accessed directly from outside the class)
	private double balance;
 
	// Constructor to initialize the account with an initial balance
	public BankAccount(double initialBalance) 
	{
     balance = initialBalance;
	}
 
	// Getter method to access the balance (reads the private variable)
	public double getBalance() 
	{
     return balance;
	}
 
	// Setter method to update the balance (but with validation)
	public void deposit(double amount) 
	{
		if (amount > 0) 
		{
         balance += amount;  // Adding deposit amount to the balance
		} 
		else 
		{
         System.out.println("Deposit amount must be positive.");
		}
	}
 
	public void withdraw(double amount) 
	{
		if (amount > 0 && amount <= balance) 
		{
         balance -= amount;  // Deducting withdraw amount from the balance
		} 
		else 
		{
         System.out.println("Invalid withdrawal amount.");
		}
	}
}


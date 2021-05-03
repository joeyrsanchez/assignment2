package com.meritamerica.assignment2;
import com.meritamerica.assignment2.AccountHolder;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		AccountHolder acHolder = new AccountHolder("John", "James", "Doe", "1123456789", 100.00, 1000.00);
		AccountHolder acHolder1 = new AccountHolder("Jane", "Mary", "Doe", "1124468256", 200.00, 500.00);
		
		// Display the account holder's toString() output
		System.out.println(acHolder.toString());
		acHolder.getCheckingAccount().deposit(500.00);
		acHolder.getSavingsAccount().withdraw(800.00);
		
		// Display the checking account's toString() ouput
		System.out.println(acHolder.getCheckingAccount().toString());
		
		// Display the savings account's toString() output
		System.out.println(acHolder.getSavingsAccount().toString());
		acHolder1.getCheckingAccount().deposit(-500.00);
		acHolder1.getSavingsAccount().withdraw(600.00);
		System.out.println(acHolder1.toString());

	}
	
}

//	public static void main(String[] args) {
//		System.out.println("Hello Merit America!");
//		
//		//Create Account Holder ah1
//		AccountHolder ah1 = new AccountHolder("John", " ", "Smith", "987654321", 100000.00, 0);
//		
//		
//		//ah1 Deposit CheckingAcount
//		ah1.getCheckingAccount().deposit(500.0);
//		
//		//ah1 Withdraw SavingsAccount
//		ah1.getSavingsAccount().withdraw(-800.0);
//		
//		System.out.println(ah1.getCheckingAccount().toString());
//		System.out.println(ah1.getSavingsAccount().toString());
//		
//		//Create Account Holder ah2
//		AccountHolder ah2 = new AccountHolder("Jane", " ", "Smith", "123456789", 100000.00, 0);
//		
//		
//		//ah2 Deposit CheckingAcount
//		ah2.getCheckingAccount().deposit(500.0);
//		
//		//ah2 Withdraw SavingsAccount
//		ah2.getSavingsAccount().withdraw(-800.0);
//		
//		//new savings account variable
//		SavingsAccount sa1 = new SavingsAccount(800); 
//		
//		System.out.println(ah1);
//		
//
//	}
//}
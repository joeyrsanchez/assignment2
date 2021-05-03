package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount{
	private static double interestRate = 0.0001;
		
	//Constructor
	public CheckingAccount (double openingBalance) {
		super(openingBalance, interestRate);
	}
		
	@Override
	public String toString() {
		return "CheckingAccount [balance=" + this.getBalance() + ", interestRate=" 
				+ interestRate + ", FutureValue=" + futureValue (3) + "]";
	}
}
package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount{
	private static double interestRate = 0.01;
	
	//Constructor
	public SavingsAccount (double openingBalance) {
		super(openingBalance, interestRate);
	}
	
	@Override
	public String toString() {
		return "SavingsAccount [balance=" + this.getBalance() + ", interestRate=" 
				+ interestRate + ", FutureValue=" + futureValue (3) + "]";
	}
}
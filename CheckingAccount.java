package com.meritamerica.assignment2;

/* Checking account class.
 * Allows to access balance, do deposit/withdraw, calculate future value
 * and set interest rate. 
 */

public class CheckingAccount extends BankAccount{
	
	public CheckingAccount(double balance) {
		super(balance, 0.01);
	}
	
}
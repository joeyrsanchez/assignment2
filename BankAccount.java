package com.meritamerica.assignment2;

public class BankAccount {
	
	//Instance variables
	private double balance;
	private double interestRate;
	private double accountNumber;
	
	public BankAccount (double balance, double interestRate, long accountNumber) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNumber = accountNumber;
	}
	
	public BankAccount (double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}

	//Getters and Setter methods
	public double getBalance() {return balance;}
	public void setBalance(double balance) {this.balance = balance;}
	public double getInterestRate() {return interestRate;}
	public void setInterestRate(double interestRate) {this.interestRate = interestRate;}
	public double getAccountNumber() {return accountNumber;}
	public void setAccountNumber(double accountNumber) {this.accountNumber = accountNumber;}
	
	public boolean withdraw(double amount) {
		if (amount > 0.0 && amount < balance) {
			balance -= amount;
			System.out.println("Savings balance = " + balance);
			return true;
		} else { 
			System.out.println("Not enough in balance.");
			return false;
		}
	}
	
	public boolean deposit (double amount) {
		if (amount>0) {
			balance += amount;
			System.out.println("Checking balance = " + balance);
			return true;
		} else 
			System.out.println("Please enter a valid amount.");
			return false;
	}
	
	
	public double futureValue(int years) {
		return Math.pow(1 + interestRate,  years) * balance;
	}
	
	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", interestRate=" 
				+ interestRate + ", FutureValue=" + futureValue (3) + "]";
	}

}

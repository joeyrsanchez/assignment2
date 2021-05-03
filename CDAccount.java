package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount{
	
	//Instance Variables
	private CDOffering cdOffering;
	private double balance;
	private double interestRate;
	private int term;
	private long accountNumber;
	private double futureValue;
	
	//Default constructor
	public CDAccount(CDOffering cdoffering, double balance){
		super(balance, cdoffering.getInterestRate());
		this.cdOffering = cdoffering;
	}
	
		
	public double getBalance() {
		return cdOffering.getBalance();
	}
	
	public double getInterestRate() {
		return cdOffering.getInterestRate();
	}
	
	public int getTerm() {
		return cdOffering.getTerm();
	}
	
	java.util.Date getStartDate() {
		return cdOffering.getStartDate();
	}
	
	public long getAccountNumber() {
		return cdOffering.getAccountNumber();
	}
	
	public double futureValue(int years) {
		return Math.pow(1 + interestRate,  years) * balance;
	}
}




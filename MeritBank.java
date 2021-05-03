package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	//instance variables
    private AccountHolder[] AccountHolder;
    private SavingsAccount[] savingsAccounts;
    private CDAccount [] cdAccounts;
    
    //default constructor
    public AccountHolder() {
    	
    }
    //special constructor
    public AccountHolder(
    String firstName,
    String middleName,
    String lastName,
    String ssn)

    {
    	//Assigned Variables used to build objects
    	this.firstName = firstName;
    	this.middleName = middleName;
    	this.lastName = lastName;
    	this.ssn = ssn;
    	this.checkingAccounts = new CheckingAccount[0];
    	this.savingsAccounts = new SavingsAccount[0];
    	this.cdAccounts = new CDAccount [0];

    }


	public static void addAccountHolder (AccountHolder accountHolder) {			
		}
	
//	public static AccountHolder[] getAccountHolders() {
	//return AccountHolders;
	
//	public static CDOffering[] getCDOfferings()
	//return CDOfferings;
	
//	public static CDOffering getBestCDOffering(double depositAmount)
	//return BestCDOffering;
	
//	public static CDOffering getSecondBestCDOffering(double depositAmount)
	//return SecondBestCDOffering;
	
//	public static void clearCDOfferings()
//	public static void setCDOfferings(CDOffering[] offerings)
	
//	public static long getNextAccountNumber()
	//return NextAccountNumber;
	
//	public static double totalBalances()
//	public static double futureValue(double presentValue, double interestRate, int term)

	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

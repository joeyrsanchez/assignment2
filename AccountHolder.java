package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder {
	
	//instance variables
    private String firstName;
    private String middleName;
    private String lastName;
    private String ssn;
    private CheckingAccount[] checkingAccounts;
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
  
	// getter/setter methods
	public String getFirstName() {return firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}
	public String getMiddleName() {return middleName;}
	public void setMiddleName(String middleName) {this.middleName = middleName;}
	public String getLastName() {return lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}
	public String getSsn() {return ssn;}
	public void setSsn(String ssn) {this.ssn = ssn;}
	public CheckingAccount[] getCheckingAccounts() {return checkingAccounts;}
	public SavingsAccount[] getSavingsAccounts() {return savingsAccounts;}
	
	
	
	//Method for Checking Account portion of Account Holder
	public CheckingAccount addCheckingAccount(double openingBalance) {
		
		//Calls a constructor and creates an object
		CheckingAccount alpha = new CheckingAccount(openingBalance);
		CheckingAccount[] temp = new CheckingAccount[checkingAccounts.length + 1];
		for (int i = 0; i < checkingAccounts.length; i++) {
			temp[i] = checkingAccounts[i];
		}
		temp[temp.length] = alpha;
		this.checkingAccounts = temp;
		return alpha;
	}
	
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		CheckingAccount[] temp = new CheckingAccount[checkingAccounts.length + 1];
		for (int i = 0; i < checkingAccounts.length; i++) {
			temp[i] = checkingAccounts[i];
		}
		temp[temp.length] = checkingAccount;
		this.checkingAccounts = temp;
		return checkingAccount;
	}

	 public int getNumberOfCheckingAccounts() {
		 return checkingAccounts.length;
	 }
	
	public double getCheckingBalance() {
		double sum = 0;
		for (int i = 0; i < checkingAccounts.length; i++) {
			sum += checkingAccounts[i].getBalance();
		}
		return sum;	
	}
	
	
	
	//Savings Account portion of Account Holder
	public SavingsAccount addSavingsAccount(double openingBalance) {
		
		//Calls a constructor and creates an object
		SavingsAccount alpha = new SavingsAccount(openingBalance);
		SavingsAccount[] temp = new SavingsAccount[savingsAccounts.length + 1];
		for (int i = 0; i < savingsAccounts.length; i++) {
			temp[i] = savingsAccounts[i];
		}
		temp[temp.length] = alpha;
		this.savingsAccounts = temp;
		return alpha;
	}
	
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		SavingsAccount[] temp = new SavingsAccount[savingsAccounts.length + 1];
		for (int i = 0; i < savingsAccounts.length; i++) {
			temp[i] = savingsAccounts[i];
		}
		temp[temp.length] = savingsAccount;
		this.savingsAccounts = temp;
		return savingsAccount;
	}
	
	 public int getNumberOfSavingsAccounts() {
		 return savingsAccounts.length;
	 }
	
	public double getSavingsBalance() {
		double sum = 0;
		for (int i = 0; i < savingsAccounts.length; i++) {
			sum += savingsAccounts[i].getBalance();
		}
		return sum;	
	}
	
	
	
	//CD Account portion of Account Holder
	public CDAccount addCDAccount(double openingBalance) {
		
		//Calls a constructor and creates an object
		CDAccount alpha = new CDAccount(openingBalance);
		CDAccount[] temp = new CDAccount[cdAccounts.length + 1];
		for (int i = 0; i < cdAccounts.length; i++) {
			temp[i] = cdAccounts[i];
		}
		temp[temp.length] = alpha;
		this.cdAccounts = temp;
		return alpha;
	}
	
	public CDAccount addCDAccount(CDAccount cdAccount) {
		CDAccount[] temp = new CDAccount[cdAccounts.length + 1];
		for (int i = 0; i < cdAccounts.length; i++) {
			temp[i] = cdAccounts[i];
		}
		temp[temp.length] = cdAccount;
		this.cdAccounts = temp;
		return cdAccount;
	}

	 public int getNumberOfCDAccounts() {
		 return cdAccounts.length;
	 }
	
	public double getCDAccount() {
		double sum = 0;
		for (int i = 0; i < cdAccounts.length; i++) {
			sum += cdAccounts[i].getBalance();
		}
		return sum;	
	}


	  @Override
		public String toString() {
			return "AccountHolder [firstName=" + firstName + ", middleName=" + middleName 
					+ ", lastName=" + lastName + ", ssn=" + ssn;

		}
}
package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");

		CDOffering[] CDOfferings = new CDOffering[10];
         /* Add 5 CDOfferings to MeritBank*/ 
		CDOfferings[0] = new CDOffering(1, 1.8 / 100);
		CDOfferings[1] = new CDOffering(2, 1.9 / 100);
		CDOfferings[2] = new CDOffering(3, 2.0 / 100);
		CDOfferings[3] = new CDOffering(5, 2.5 / 100);
		CDOfferings[4] = new CDOffering(10, 2.2 / 100);
		MeritBank.setCDOfferings(CDOfferings);
		/* Instantiate a new AccountHolder (ah1)*/
		AccountHolder ah1 = new AccountHolder("John", "James", "Doe", "987654321");
		
		
				
		/*Add a checking account with an opening balance of $1,000 as well as a 
		 * savings account with an opening balance of $10,000 
		 * to ah1*/
		ah1.addCheckingAccount(1000);
		System.out.println(MeritBank.getAccountHolders()[0].getCheckingAccounts()[0].getBalance());
		ah1.addSavingsAccount(10000); 
		  /*Add a an opening balance of $5,000 as well as a 
		   * savings account with an opening balance of $50,000 to ah1*/
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(500000);
		/*Add a an opening balance of $5,000 as well as a 
		 * savings account with an opening
		 * balance of $50,000 to ah1*/
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);
		/*Add a an opening balance of $5,000 as well as a savings account with an opening
		 * 
		 * balance of $50,000 to ah1*/
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);
		
		ah1.addCDAccount(MeritBank.getBestCDOffering(1000), 1000);
		System.out.println(ah1.getCDAccounts()[0].getTerm());
		MeritBank.addAccountHolder(ah1);
		
		AccountHolder ah2 = new AccountHolder("Mary", "Anne", "Doe", "123456789");
		ah2.addCheckingAccount(1000);
		ah2.addSavingsAccount(10000);
		ah2.addCDAccount(MeritBank.getSecondBestCDOffering(1000), 1000);
		System.out.println(ah2.getCDAccounts()[0].getTerm());
		MeritBank.addAccountHolder(ah2);
		
		MeritBank.clearCDOfferings();
		
		AccountHolder ah3 = new AccountHolder("Jack", "Joseph", "Doe", "125849657");
		ah3.addCDAccount(MeritBank.getSecondBestCDOffering(1000), 1000);
		System.out.println(ah3.getCDAccounts().length);
		ah3.addCheckingAccount(1000);
		ah3.addSavingsAccount(10000);
		MeritBank.addAccountHolder(ah3);
		
		MeritBank.totalBalances();
		/*
		 
		 * 
		   Confirm last checking and savings accounts were not created Add the best CD offering as a
		 * 
		 * CD account on ah1 Add ah1 to Merit Bank’s list of account holders Instantiate
		 * 
		 * a new AccountHolder (ah2) Add a checking account with an opening balance of
		 * 
		 * $1,000 as well as a savings account with an opening balance of $10,000 to ah2
		 * 
		 * Add the second best CD offering as a CD account on ah2 Add ah2 to Merit
		 * 
		 * Bank’s list of account holders Clear the CDs being offered by MeritBank
		 * 
		 * Instantiate a new AccountHolder (ah3) Add the second best CD offering as a CD
		 * 
		 * account on ah3 Confirm a CD account was not created on ah3 Add a checking
		 * 
		 * account with an opening balance of $1,000 as well as a savings account with
		 * 
		 * 
		 * an opening balance of $10,000 to ah3 Add ah3 to Merit Bank’s list of account
		 * 
		 * holders Get the total balance of all accounts held by Merit Bank’s account
		 * 
		 * holders
		 */

	}
}


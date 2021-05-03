package com.meritamerica.assignment2;

public class CDOffering {

	//Instance variables
	private int term;
	private double interestRate;
	
    //special constructor
    public CDOffering(int term, double interestRate) {
    	
	//Assigned variables used to build objects
	this.term = term;
	this.interestRate = interestRate;
    }

	//getters/setters methods
	public int getTerm() {
		return term;
		}
	
	public double getInterestRate() {
		return interestRate;
		}
}


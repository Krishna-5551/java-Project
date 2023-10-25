package com.amdocs.bankaccountdemo;

public class SavingAccount extends BankAccount {
	
	public SavingAccount(double initialAmt) {
		
		super(initialAmt);
	}
	
	public void interest(double Amount) {
		
		double interest = Amount*0.03;
		Deposit(interest);
		System.out.println("Applied interest is : "+interest);
		
	}

}

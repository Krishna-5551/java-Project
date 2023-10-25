package com.amdocs.bankaccountdemo;

public class currentAccount extends BankAccount {
	
	public currentAccount(double initialAmt) {
		
		super(initialAmt);
		
	}
	
	public void withdraw(double Amount) {
		
		if(Amount > 0 && Amount<= Balance) 
		{
			//Withdraw charges of RS 200 apply on the withdrawl amount
			if(Amount >=200) {
				Amount = Amount+200;
			}
			super.withdraw(Amount);
					
		}
		else {
			System.out.println("Invalid Withdrawal amount...");
		}
		
	}

}

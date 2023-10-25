package com.amdocs.bankaccountdemo;

public class BankAccount {
	
	protected double Balance;
	
	public BankAccount(double initialAmt) {
		
		this.Balance = initialAmt;
		System.out.println(" Account created with Initial Amount : "+Balance);
		
	}
	
	public void Deposit(double Amount) {
		
		
			Balance = Balance + Amount;
			System.out.println(" Amount Deposited is : "+ Amount);
		
		}
	
	public void withdraw(double Amount) {
		
		if(Amount > 0 && Amount <= Balance) {
			
			Balance = Balance-Amount;
			System.out.println(" Amount Withdrawn is : "+Amount);		
			
		}
		else {
			System.out.println("Insufficient balance to Withdraw amount...");
		}	
		
	}
	
	public void checkBalance() {
		
		System.out.println(" the available balance is : "+Balance);
		
	}
		
	
	public void transfer(double Amount, BankAccount Acc) {
		
		if( Amount > 0 && Amount<= Balance) {
			
			this.withdraw(Amount);
			Acc.Deposit(Amount);
			System.out.println("Amount transfered is : "+Amount);
			
		}
		else {
			
			System.out.println("Insufficient Amount to transfer...");
		}
		
		
	}
	}
	



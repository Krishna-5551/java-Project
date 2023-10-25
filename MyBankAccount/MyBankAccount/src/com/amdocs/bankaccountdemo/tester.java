package com.amdocs.bankaccountdemo;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BankAccount B1  = new BankAccount(1000);
		//BankAccount B2  = new BankAccount(2000);
		//System.out.println(B1);
		//System.out.println(B2);
		
		//B1.withdraw(100);
		//B2.transfer(200, B1);
		//B1.Deposit(100);
		//B1.checkBalance();
		//B2.checkBalance();
		
		
		//Checking Saving Account
		SavingAccount savingAcc = new SavingAccount(1000);
		/*savingAcc.Deposit(200);
		savingAcc.interest(100);
		System.out.println("The update of Saving Account is : "+ savingAcc);
		savingAcc.checkBalance();*/
		
		
		//checking Current Account
		currentAccount currentAcc = new currentAccount(2000);
		/*currentAcc.withdraw(400);
		System.out.println("The update of Current Account is : "+currentAcc);
		currentAcc.checkBalance();*/
		
		
		//Transfer Amount from one account to another
		currentAcc.transfer(100, savingAcc);
		System.out.println(" Current Account Status : "+ currentAcc);
		currentAcc.checkBalance();
		
		System.out.println("Savings Account Status : "+ savingAcc);
		savingAcc.checkBalance();
		
		

	}

}

package edu.mum.asd.creditcard;

import edu.mum.asd.account.Account;

public class Gold extends Account{

	String accountType = "Gold";
	Double monthlyInterest = 0.06;
	Double minimumPayment = 0.1;
	
	@Override
	public void addInterest() {
		this.balance += this.balance * monthlyInterest;
	}

	@Override
	public String getAccountType() {
		return accountType;
	}
	
	public Double getMinimumPayment(){
		return this.balance * minimumPayment;
	}

}

package edu.mum.asd.creditcard;

import edu.mum.asd.account.Account;

public class Bronze extends Account{

	String accountType = "Bronze";
	Double monthlyInterest = 0.1;
	Double minimumPayment = 0.14;
	
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

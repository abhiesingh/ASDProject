package edu.mum.asd.creditcard;

import edu.mum.asd.account.Account;

public class Silver extends Account{

	String accountType = "Silver";
	Double monthlyInterest = 0.08;
	Double minimumPayment = 0.12;
	
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

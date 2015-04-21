/**
 * 
 */
package edu.mum.asd.bank;

import edu.mum.asd.account.*;

/**
 * @author 984413
 *
 */
public class Checking extends Account{

	String accountType = "Checking";
	Double interestRate = 0.02;
	
	public Checking(){
		super();
	}
	
	@Override
	public void addInterest() {
		this.balance += this.balance * interestRate;
	}
	
	public String getAccountType(){
		return accountType;
	}

}

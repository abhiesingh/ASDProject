/**
 * 
 */
package edu.mum.asd.bank;

import edu.mum.asd.account.*;

/**
 * @author 984413
 *
 */
public class Saving extends Account{

	String accountType = "Saving";
	Double interestRate = 0.05;
	
	public Saving(){
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

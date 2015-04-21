/**
 * 
 */
package edu.mum.asd.account;

import java.util.ArrayList;

/**
 * @author 984413
 *
 */
public abstract class Account implements IAccount{
	
	static Integer accountNumberList = 1000;
	private Integer accountNumber;
	protected Double balance;
	
	ArrayList<ITransaction> transactions;
	
	public Account(){
		transactions = new ArrayList<ITransaction>();
		balance = 0.0;
		accountNumber = ++accountNumberList;
	}
	
	@Override
	public Integer getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public Double getBalance() {
		return this.balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	@Override
	public void addTransaction(ITransaction transaction) {
		transactions.add(transaction);
	}
	
	public void deposit(Double amount){
		this.balance += amount;
	}
	
	public void withdraw(Double amount){
		this.balance -= amount;
	}

	@Override
	public abstract void addInterest();
	
	@Override
	public abstract String getAccountType();
}

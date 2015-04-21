/**
 * 
 */
package edu.mum.asd.transaction;

/**
 * @author 984416
 *
 */
public class AccountDemo {
	
	private Integer accountNumber;
	private Double balance;
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	public void deposit(Double deposit){
		
		this.balance  = 1000d;
		this.balance += deposit;
		
		System.out.println("Deposit" + balance);
	}
	
	public void withdraw(Double deposit){
		System.out.println("Withdraw");
	}
	
	public void addInterest(){
		System.out.println("Add interest");
	}

}

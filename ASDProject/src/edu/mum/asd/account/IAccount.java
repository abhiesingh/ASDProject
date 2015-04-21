/**
 * 
 */
package edu.mum.asd.account;

/**
 * @author 984413
 *
 */
public interface IAccount {
	public Integer getAccountNumber();
	public Double getBalance();
	public void addInterest();
	public void addTransaction(ITransaction it);
	public String getAccountType();
}

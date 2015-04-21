/**
 * 
 */
package edu.mum.asd.transaction;

/**
 * @author 984416
 *
 */
public class Deposit extends ATransaction {

	private AccountDemo account;
	
	public Deposit(AccountDemo account){
		this.account = account;
	}
	
	@Override
	public void execute(){
		account.deposit(super.getTransactionAmount());
	}
}

/**
 * 
 */
package edu.mum.asd.transaction;

/**
 * @author 984416
 *
 */
public class Withdraw extends ATransaction {

	private AccountDemo account;
	
	public Withdraw(AccountDemo account){
		this.account = account;
	}
	
	@Override
	public void execute(){
		account.withdraw(super.getTransactionAmount());
	}
}

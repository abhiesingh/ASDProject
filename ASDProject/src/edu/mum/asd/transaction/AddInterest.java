/**
 * 
 */
package edu.mum.asd.transaction;

/**
 * @author 984416
 *
 */
public class AddInterest extends ATransaction {
	private AccountDemo account;
	
	public AddInterest(AccountDemo account){
		this.account = account;
	}
	
	@Override
	public void execute(){
		account.addInterest();
	}
	
}

/**
 * 
 */
package edu.mum.asd.account;

import java.util.ArrayList;

/**
 * @author 984413
 *
 */
public class AccountManager {
	ArrayList<IAccount> accounts;
	
	public AccountManager(){
		this.accounts = new ArrayList<IAccount>();
	}
	
	public void addAccount(IAccount account){
		this.accounts.add(account);
	}
	
	public void removeAccount(IAccount account){
		this.accounts.remove(account);
	}
	
	public IAccount findAccount(Integer accountNumber){
		for(IAccount acc:accounts){
			if(acc.getAccountNumber() == accountNumber){
				return acc;
			}
		}
		return null;
	}
	
	public ArrayList<IAccount> getAllAccounts(){
		return this.accounts;
	}
}

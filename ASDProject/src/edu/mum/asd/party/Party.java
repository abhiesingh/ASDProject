/**
 * 
 */
package edu.mum.asd.party;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author Prabin
 *
 */
public abstract class  Party implements IParty {
	private String name;
	private String email;
	private ArrayList<Address>addressList;
	public abstract void sendEmail(ITransaction transaction,IAccount account,Predicate predicate);
	public Party(String name, String email) {
		
		this.name = name;
		this.email = email;
		addressList = new ArrayList<Address>();
		
	}
	
	public void add(Address address){
		addressList.add(address);
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(ArrayList<Address> addressList) {
		this.addressList = addressList;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}

/**
 * 
 */
package edu.mum.asd.party;

import java.util.function.Predicate;

/**
 * @author Prabin
 *
 */
public class Organization extends Party{
	private Integer employeeCount;
	
	public Organization(String name, String email) {
		super(name, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendEmail(ITransaction transaction, IAccount account,
			Predicate predicate) {
		// TODO Auto-generated method stub
		
	}
	

}

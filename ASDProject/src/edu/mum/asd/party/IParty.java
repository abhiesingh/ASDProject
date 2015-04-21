/**
 * 
 */
package edu.mum.asd.party;

import java.util.function.Predicate;

/**
 * @author Prabin
 *
 */
public interface IParty {
	public void add(Address address);
	public  void sendEmail(ITransaction transaction,IAccount account,Predicate predicate);

}

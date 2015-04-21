/**
 * 
 */
package edu.mum.asd.transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 984416
 *
 */
public class TransactionManager {

	private List<ITransaction> transactionList;

	/**
	 * 
	 */
	public TransactionManager() {
		super();
		transactionList = new ArrayList<ITransaction>();
	}

	public List<ITransaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<ITransaction> transactionList) {
		this.transactionList = transactionList;
	}
	
	public void addTransaction(ITransaction transaction){
		transactionList.add(transaction);
	}
	
	public void executeTransaction(){
		ITransaction transaction = transactionList.get(transactionList.size() - 1);
		transaction.execute();
		transactionList.remove(transactionList.size() - 1);
	}
}

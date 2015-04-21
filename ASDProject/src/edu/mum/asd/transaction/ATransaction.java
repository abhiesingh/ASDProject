/**
 * 
 */
package edu.mum.asd.transaction;

import java.util.Calendar;

/**
 * @author 984416
 *
 */
public class ATransaction implements ITransaction {
	
	private Calendar transactionDate;
	private String transactionName;
	private Double transactionAmount;

	/**
	 * Default constructor
	 */
	public ATransaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param transactionDate
	 * @param transactionName
	 * @param transactionAmount
	 */
	public ATransaction(Calendar transactionDate, String transactionName,
			Double transactionAmount) {
		super();
		this.transactionDate = transactionDate;
		this.transactionName = transactionName;
		this.transactionAmount = transactionAmount;
	}

	public Calendar getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Calendar transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionName() {
		return transactionName;
	}

	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}

	public Double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	/* (non-Javadoc)
	 * @see edu.mum.asd.transaction.ITransaction#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

}

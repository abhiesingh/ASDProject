package edu.mum.asd.creditcard;

import java.util.Calendar;

import edu.mum.asd.party.Person;

public class CreditCardCustomer extends Person{
	private Integer creditCardNumber;
	public Calendar expireDate;

	public CreditCardCustomer(String name, String email,Integer creditCardNuimber,Calendar expireDate) {
		super(name, email);
		// TODO Auto-generated constructor stub
		this.creditCardNumber=creditCardNuimber;
		this.expireDate=expireDate;
	}

	public Integer getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(Integer creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public Calendar getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Calendar expireDate) {
		this.expireDate = expireDate;
	}
	
	
	

}

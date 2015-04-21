package edu.mum.asd.transaction;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TransactionTest {
	
	AccountDemo account = null;
	Deposit deposit = null;
	Withdraw withdraw = null;
	AddInterest addInterest = null;
	TransactionManager commandManager = null;

	@Before
	public void setUp() throws Exception {
		account = new AccountDemo();
		deposit = new Deposit(account);
		withdraw = new Withdraw(account);
		addInterest = new AddInterest(account);
		commandManager = new TransactionManager();
		
	}

	@After
	public void tearDown() throws Exception {
		account = null;
		deposit = null;
		withdraw = null;
		addInterest = null;
		commandManager = null;
	}

	@Test
	public void testDeposit() {
		deposit.setTransactionAmount(200d);
		commandManager.addTransaction(deposit);
		commandManager.executeTransaction();
	}
	
	@Test
	public void testWithdraw() {
		withdraw.setTransactionAmount(200d);
		commandManager.addTransaction(withdraw);
		commandManager.executeTransaction();
	}
	
	@Test
	public void testAddInterest() {
		commandManager.addTransaction(addInterest);
		commandManager.executeTransaction();
	}

}

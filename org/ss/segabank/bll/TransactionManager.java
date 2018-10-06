package org.ss.segabank.bll;

import org.ss.segabank.bol.Transaction;

public class TransactionManager {
	Transaction transaction;
	
	public TransactionManager() {}
	
	protected Transaction getTransaction() {
		return transaction;
	}
	
	protected void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	/**
	 * La méthode de fabrication
	 */
	public Transaction creationDeTransaction() {
		this.transaction = new Transaction();	
		return transaction;
		
	}
}

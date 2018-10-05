package org.ss.segabank.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue( "SAVING_ACCOUNT" )//valeur donné dans la colonne discrimination type le la single table.
public class SavingAccount extends Account {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double interestRate;
	
	public SavingAccount() {super();}
	
	public SavingAccount( double interestRate ) {
		super();
		this.interestRate = interestRate;
	}
	
	public SavingAccount( double balance, double interestRate ) {
		super( balance );
		this.interestRate = interestRate;
	}
	
	public SavingAccount( Long id, double balance, double interestRate ) {
		super( id, balance );
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate( double interestRate ) {
		this.interestRate = interestRate;
	}
	
	public void applyInterstRate() {
		
		double interest = balance * interestRate;
		if ( interest > 0 ) {
			Transaction transaction = new Transaction( Transaction.Type.SIM, new Date(), interest, balance );
			balance += interest;
			transaction.setBalanceAfter( balance );
			this.addTransaction( transaction );
		}
	}
	
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer( "SavingAccount{" );
		sb.append( "id=" ).append( id );
		sb.append( ", balance=" ).append( balance );
		sb.append( ", interestRate=" ).append( interestRate );
		sb.append( '}' );
		return sb.toString();
	}
}

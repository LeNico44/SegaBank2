package org.ss.segabank.bol;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( "SIMPLE_ACCOUNT" )
public class SimpleAccount extends Account {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double overdraft;
	
	public SimpleAccount() { super(); }
	
	public SimpleAccount( double overdraft ) {
		super();
		this.overdraft = overdraft;
	}
	
	public double getOverdraft() {
		return overdraft;
	}
	
	public void setOverdraft( double overdraft ) {
		this.overdraft = overdraft;
	}
}
package org.ss.segabank.bol;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( "SAVING_ACCOUNT")
public class SavingAccount extends Account{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}

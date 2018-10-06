package org.ss.segabank.bol;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( "CHARGED_ACCOUNT" )
public class ChargedAccount extends Account {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

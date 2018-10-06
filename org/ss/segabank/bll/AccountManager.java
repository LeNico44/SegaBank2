package org.ss.segabank.bll;

import org.ss.segabank.bol.Account;
import org.ss.segabank.bol.Agency;
import org.ss.segabank.bol.SimpleAccount;

public class AccountManager {
	Account compte;
	
	public AccountManager () {}

	protected Account getCompte() {
		return compte;
	}

	protected void setCompte(Account compte) {
		this.compte = compte;
	}
	
	/**
	 * La méthode de fabrication
	 */
	public Account creationDeCompte(double solde, String type, double decouvert, Agency agence) {
		if(type.equals("SIMPLE_ACCOUNT")) {
			compte = new SimpleAccount();
			compte.setBalance(solde);
			(( SimpleAccount ) compte).setOverdraft( decouvert );
			compte.setAgency(agence);
		}		
		return compte;
		
	}
	
}

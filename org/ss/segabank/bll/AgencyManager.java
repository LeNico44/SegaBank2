package org.ss.segabank.bll;

import org.ss.segabank.bol.*;

public class AgencyManager {
	private Agency agence;
	
	public AgencyManager () {
		
	}
	
	protected Agency getAgence() {
		return agence;
	}
	
	protected void setAgence(Agency agence) {
		this.agence = agence;
	}
	
	/**
	 * La méthode de fabrication
	 */
	public void creationDAgenceAvecAdresse(String number, String street, String zipCode, String city, String code) {
		Address adresse = new Address(number, street, zipCode, city);
		this.agence = new Agency();
		agence.setCode(code);
		agence.setAddress(adresse);
		
	}
	
}

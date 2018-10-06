package org.ss.segabank.bll;

import org.ss.segabank.bol.*;

public class AddressManager {
	private Address adresse;
	
	public AddressManager() {}

	protected Address getAdresse() {
		return adresse;
	}

	protected void setAdresse(Address adresse) {
		this.adresse = adresse;
	}
	
	
	/**
	 * La méthode de fabrication
	 */
	
	public void creationDAdresseAvecNumeroRueDepartementVille(String number, String street, String zipCode, String city) {
		this.adresse = new Address(number, street, zipCode, city);
	}
	
	/**
	 * Affichage d'une adresse
	 */
	public String AffichageDeLAdresse() {
		return adresse.toString();
	}
	
}

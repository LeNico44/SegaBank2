package org.ss.segabank.ui;

import org.ss.segabank.bll.*;

public class Test {

	public static void main(String[] args) {
		AddressManager fabriqueDAdresse = new AddressManager();
		fabriqueDAdresse.creationDAdresseAvecNumeroRueDepartementVille("18", "Street", "44000", "City");
		System.out.println(fabriqueDAdresse.AffichageDeLAdresse());
		fabriqueDAdresse.creationDAdresseAvecNumeroRueDepartementVille("22", "Coucou", "75000", "Paris");
		System.out.println(fabriqueDAdresse.AffichageDeLAdresse());
		AgencyManager fabriqueDAgence = new AgencyManager();
		fabriqueDAgence.creationDAgenceAvecAdresse("7", "street", "77000", "Septsept", "777codeBank");
		System.out.println(fabriqueDAgence.toString());
	}

}

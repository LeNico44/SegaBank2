package org.ss.segabank.ui;

import org.ss.segabank.bll.*;

public class Test {

	public static void main(String[] args) {
		AddressManager fabriqueDAdresse = new AddressManager();
		fabriqueDAdresse.creationDAdresseAvecNumeroRueDepartementVille("18", "Street", "44000", "City");
		
		System.out.println(fabriqueDAdresse.AffichageDeLAdresse());

	}

}

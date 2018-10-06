package org.ss.segabank.ui;

import javax.persistence.*;

import org.ss.segabank.bll.*;
import org.ss.segabank.bol.Agency;

public class Test {
	
	private static final String PERSISTENCE_UNIT = "sega-bank";

	public static void main(String[] args) {
		AddressManager fabriqueDAdresse = new AddressManager();
		fabriqueDAdresse.creationDAdresseAvecNumeroRueDepartementVille("18", "Street", "44000", "City");
		System.out.println(fabriqueDAdresse.AffichageDeLAdresse());
		fabriqueDAdresse.creationDAdresseAvecNumeroRueDepartementVille("22", "Coucou", "75000", "Paris");
		System.out.println(fabriqueDAdresse.AffichageDeLAdresse());
		AgencyManager fabriqueDAgence = new AgencyManager();
		fabriqueDAgence.creationDAgenceAvecAdresse("7", "street", "77000", "Septsept", "77codeBank");
		System.out.println(fabriqueDAgence.toString()); 
		
		AccountManager fabriqueDeCompte = new AccountManager();
		
		Agency agenceZ = fabriqueDAgence.creationDAgenceAvecAdresse("7", "street", "77000", "Septsept", "77codeBank");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( PERSISTENCE_UNIT );
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(agenceZ);
		em.persist( fabriqueDeCompte.creationDeCompte(500, "SIMPLE_ACCOUNT", 300, agenceZ));
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}

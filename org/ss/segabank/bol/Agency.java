package org.ss.segabank.bol;

import java.io.Serializable;

import javax.persistence.*;

import org.ss.segabank.bol.Address;

@Entity
@Table( name = "agency" )
public class Agency implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )//IDENTITY crée des id propre à chaque table
	private Long id;//le type des id pour Hybernet doit être un objet.
	@Column( length = 10 )//limite la colonne à 10 caractères
	//@Transient permet de ne pas prendre en compte pour le mapping et donc n'éxistera pas en base
	private String code;
	@Embedded//injecte les attribut de la classe Address dans la table agence
	private Address adresse;
	
	public Agency() {
		adresse = new Address();
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId( Long id ) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode( String code ) {
		this.code = code;
	}
	
	public Address getAddress() {
		return adresse;
	}
	
	public void setAddress( Address adresse ) {
		this.adresse = adresse;
	}
}

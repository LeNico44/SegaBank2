package org.ss.segabank.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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
	private Address address;
	@OneToMany( mappedBy = "agency", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true )
	private Set<Account> accounts;
	
	public Agency() {
		address = new Address();
		accounts = new HashSet<>();
	}
	
	public Agency( String code, Address address ) {
		this();
		this.code = code;
		this.address = address;
	}
	
	public Agency( Long id, String code, Address address ) {
		this.id = id;
		this.code = code;
		this.address = address;
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
		return address;
	}
	
	public void setAddress( Address address ) {
		this.address = address;
	}
	
	public Set<Account> getAccounts() {
		return accounts;
	}
	
	public void setAccounts( Set<Account> accounts ) {
		this.accounts = accounts;
	}
	
	public void addAccount( Account account ) {
		account.setAgency( this );
	}
	
	public void removeAccount( Account account ) {
		account.setAgency( null );
	}
	
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer( "Agency{" );
		sb.append( "id=" ).append( id );
		sb.append( ", code='" ).append( code ).append( '\'' );
		sb.append( ", address=" ).append( address );
		sb.append( '}' );
		return sb.toString();
	}
}
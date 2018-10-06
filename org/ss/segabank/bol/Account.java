package org.ss.segabank.bol;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.ss.segabank.bol.Agency;
import org.ss.segabank.bol.Transaction;

@Entity
@Table( name = "bank_account" )
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )//strategy d'hertage
@DiscriminatorColumn( name = "type" )
public abstract class Account implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	protected Long id;
	protected double balance;
	@ManyToOne
	@JoinColumn( name = "id_agency" )//préciser le nom de la colonne créée pour la clé étrangère sinon JPA crée des nom barbares
	protected Agency agency;
	@OneToMany( mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true )
	protected Set<Transaction> transactions;
	
	public Account() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId( Long id ) {
		this.id = id;
	}
	
	protected double getBalance() {
		return balance;
	}

	public void setBalance( double balance ) {
		this.balance = balance;
	}

	protected Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}
	
	public Set<Transaction> getTransactions() {
		return transactions;
	}
	
	public void setTransactions( Set<Transaction> transactions ) {
		this.transactions = transactions;
	}

}

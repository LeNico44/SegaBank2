package org.ss.segabank.bol;

import javax.persistence.*;

import org.ss.segabank.bol.Account;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "bank_transaction" )
public class Transaction implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	@Enumerated( EnumType.STRING )//Si ( EnumType.STRING ) est préciser les valeurs des enums est stocké en base, sans c'est l'indexation quii est stockée en commençant par 0.
	private Type type;
	//@Temporal(TemporalType.DATE) avec DATE ou TIME ou DATE TIME permet de préciser le type enregistré
	private Date date;
	private double amount;
	private double balanceBefore;
	private double balanceAfter;
	@ManyToOne
	@JoinColumn( name = "id_account" )
	private Account account;
	
	public Transaction() {}
	
	public Long getId() {
		return id;
	}
	
	public void setId( Long id ) {
		this.id = id;
	}
	
	public Type getType() {
		return type;
	}
	
	public void setType( Type type ) {
		this.type = type;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate( Date date ) {
		this.date = date;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount( double amount ) {
		this.amount = amount;
	}
	
	public double getBalanceBefore() {
		return balanceBefore;
	}
	
	public void setBalanceBefore( double balanceBefore ) {
		this.balanceBefore = balanceBefore;
	}
	
	public double getBalanceAfter() {
		return balanceAfter;
	}
	
	public void setBalanceAfter( double balanceAfter ) {
		this.balanceAfter = balanceAfter;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount( Account account ) {
		if ( this.account != null ) {
			this.account.getTransactions().remove( this );
		}
		this.account = account;
		if ( this.account != null ) {
			this.account.getTransactions().add( this );
		}
	}
	
	
	//énumération des types des mouvements comptables
	public enum Type {
		IPM( "Versement initial" ), PM( "Versement" ), DM( "Retrait" ), SIM( "Interêt" );
		
		private String value;
		
		private Type( String value ) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return value;
		}
	}
}

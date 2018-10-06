/**
 * 
 */
package org.ss.segabank.bol;

import java.io.Serializable;

/**
 * @author nicolas
 *
 */
public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String number;
	private String street;
	private String zipCode;
	private String city;
	
	public Address() {}
	
	public Address(String number, String street, String zipCode, String city) {
		this.number = number;
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
	}

	protected String getNumber() {
		return number;
	}
	protected void setNumber(String number) {
		this.number = number;
	}
	protected String getStreet() {
		return street;
	}
	protected void setStreet(String street) {
		this.street = street;
	}
	protected String getZipCode() {
		return zipCode;
	}
	protected void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	protected String getCity() {
		return city;
	}
	protected void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer( "Address{" );
		sb.append( "number='" ).append( number ).append( '\'' );
		sb.append( ", street='" ).append( street ).append( '\'' );
		sb.append( ", zipCode='" ).append( zipCode ).append( '\'' );
		sb.append( ", city='" ).append( city ).append( '\'' );
		sb.append( '}' );
		return sb.toString();
	}
}

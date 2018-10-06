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
	
	protected Address() {}
	
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
}

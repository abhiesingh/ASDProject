/**
 * 
 */
package edu.mum.asd.party;

/**
 * @author Prabin
 *
 */
public class Address {
	private String street;
	private String city;
	private String state;
	private Integer zip;
	private String type;
	public Address(String street, String city, String state, Integer zip,
			String type) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.type = type;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZip() {
		return zip;
	}
	public void setZip(Integer zip) {
		this.zip = zip;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	


}

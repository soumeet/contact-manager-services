package com.infosys.contactmanager.model;

import java.io.Serializable;

public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer addressId;
	private String addressType;
	private String city;
	private String country;
	private String houseno;
	private String locality;
	private String pincode;
	private String street;
	private Contact contact;

	public Address() {
	}

	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHouseno() {
		return this.houseno;
	}

	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

	public String getLocality() {
		return this.locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
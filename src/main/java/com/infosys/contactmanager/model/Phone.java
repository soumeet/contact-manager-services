package com.infosys.contactmanager.model;

import java.io.Serializable;

public class Phone implements Serializable {
	private static final long serialVersionUID = 1L;

	private String phoneNumber;
	private String phoneType;
	private Contact contact;

	public Phone() {
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneType() {
		return this.phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
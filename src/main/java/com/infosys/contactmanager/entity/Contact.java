package com.infosys.contactmanager.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the contact database table.
 * 
 */
@Entity
@NamedQuery(name="Contact.findAll", query="SELECT c FROM Contact c")
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="contact_id")
	private Integer contactId;

	private String company;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	private String suffix;

	//bi-directional many-to-one association to Address
	@OneToMany(mappedBy="contact")
	private List<Address> addresses;

	//bi-directional many-to-one association to Phone
	@OneToMany(mappedBy="contact")
	private List<Phone> phones;

	//bi-directional many-to-many association to Label
	@ManyToMany
	@JoinTable(
		name="contact_label"
		, joinColumns={
			@JoinColumn(name="contact_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="label_id")
			}
		)
	private List<Label> labels;

	//bi-directional many-to-one association to Email
	@OneToMany(mappedBy="contact")
	private List<Email> emails;

	//bi-directional one-to-one association to Photo
	@OneToOne(mappedBy="contact")
	private Photo photo;

	public Contact() {
	}

	public Integer getContactId() {
		return this.contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSuffix() {
		return this.suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Address addAddress(Address address) {
		getAddresses().add(address);
		address.setContact(this);

		return address;
	}

	public Address removeAddress(Address address) {
		getAddresses().remove(address);
		address.setContact(null);

		return address;
	}

	public List<Phone> getPhones() {
		return this.phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public Phone addPhone(Phone phone) {
		getPhones().add(phone);
		phone.setContact(this);

		return phone;
	}

	public Phone removePhone(Phone phone) {
		getPhones().remove(phone);
		phone.setContact(null);

		return phone;
	}

	public List<Label> getLabels() {
		return this.labels;
	}

	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}

	public List<Email> getEmails() {
		return this.emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public Email addEmail(Email email) {
		getEmails().add(email);
		email.setContact(this);

		return email;
	}

	public Email removeEmail(Email email) {
		getEmails().remove(email);
		email.setContact(null);

		return email;
	}

	public Photo getPhoto() {
		return this.photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

}
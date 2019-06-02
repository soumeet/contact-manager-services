package com.infosys.contactmanager.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the email database table.
 * 
 */
@Entity
@NamedQuery(name="Email.findAll", query="SELECT e FROM Email e")
public class Email implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="email_id")
	private String emailId;

	@Column(name="email_type")
	private String emailType;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name="contact_id")
	private Contact contact;

	public Email() {
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmailType() {
		return this.emailType;
	}

	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
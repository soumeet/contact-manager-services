package com.infosys.contactmanager.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the label database table.
 * 
 */
@Entity
@NamedQuery(name="Label.findAll", query="SELECT l FROM Label l")
public class Label implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="label_id")
	private Integer labelId;

	@Column(name="label_name")
	private String labelName;

	//bi-directional many-to-many association to Contact
	@ManyToMany(mappedBy="labels")
	private List<Contact> contacts;

	public Label() {
	}

	public Integer getLabelId() {
		return this.labelId;
	}

	public void setLabelId(Integer labelId) {
		this.labelId = labelId;
	}

	public String getLabelName() {
		return this.labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public List<Contact> getContacts() {
		return this.contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

}
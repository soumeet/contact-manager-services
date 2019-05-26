package com.infosys.contactmanager.entity;

import java.io.Serializable;
import javax.persistence.*;


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

}
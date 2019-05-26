package com.infosys.contactmanager.model;

import java.io.Serializable;

public class Label implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer labelId;
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
package com.infosys.contactmanager.model;

import java.io.Serializable;

public class Photo implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer photoId;
	private String filepath;
	private Contact contact;

	public Photo() {
	}

	public Integer getPhotoId() {
		return this.photoId;
	}

	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
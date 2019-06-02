package com.infosys.contactmanager.dto;

public class PhotoDTO {

	private Integer photoId;
	private String filepath;

	public PhotoDTO() {
	}

	public Integer getPhotoId() {
		return photoId;
	}

	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

}
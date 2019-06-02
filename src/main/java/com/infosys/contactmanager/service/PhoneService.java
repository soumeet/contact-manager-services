package com.infosys.contactmanager.service;

import java.util.List;

import com.infosys.contactmanager.entity.Phone;

public interface PhoneService {

	public List<String> getAllNos();

	public List<Phone> getAllNosForContact(Integer contactId);
	
	public Phone getPhone(String phoneNumber);
}

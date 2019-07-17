package com.infosys.contactmanager.service;

import java.util.List;

import com.infosys.contactmanager.dto.AddContactRequestDTO;
import com.infosys.contactmanager.entity.Contact;

public interface ContactService {

	public List<Contact> getAllContacts();
	
	public Contact getContact(Integer contactId);
	
	public String addContact(AddContactRequestDTO contact);
}

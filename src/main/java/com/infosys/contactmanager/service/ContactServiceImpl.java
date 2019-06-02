package com.infosys.contactmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.contactmanager.entity.Contact;
import com.infosys.contactmanager.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactRepository;
	
	@Override
	public List<Contact> getAllContacts() {
		return contactRepository.getAllContacts();
	}

	@Override
	public Contact getContact(Integer contactId) {
		return contactRepository.getOne(contactId);
	}

}

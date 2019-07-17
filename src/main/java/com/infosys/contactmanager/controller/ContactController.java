package com.infosys.contactmanager.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.contactmanager.dto.AddContactRequestDTO;
import com.infosys.contactmanager.dto.ContactDTO;
import com.infosys.contactmanager.entity.Contact;
import com.infosys.contactmanager.mapper.ContactMapper;
import com.infosys.contactmanager.service.ContactService;

@RestController
@RequestMapping(path="/contact")
public class ContactController {

	@Autowired
	ContactService contactService;
	
	@Autowired
	ContactMapper contactMapper;
	
	@GetMapping(path="/getAll", produces="application/json")
	public List<ContactDTO> getAllContacts(){
		System.out.println("IN " + ContactController.class + " getAllContacts() ");
		List<Contact> contacts = contactService.getAllContacts();
		return contacts.stream()
				.map(contact -> contactMapper.convertToDTO(contact))
				.collect(Collectors.toList());
	}
	
	@GetMapping(path="/get", produces="application/json")
	public ContactDTO getContact(@RequestParam("contactId") Integer contactId){
		System.out.println("IN " + ContactController.class + " getContact() contactId: " + contactId);
		Contact contact = contactService.getContact(contactId);
		return contactMapper.convertToDTO(contact);
	}
	
	@PostMapping(path="/add", produces="application/json")
	public String addContact(@RequestBody AddContactRequestDTO addContactDTO) {
		System.out.println("IN " + ContactController.class + " addContact() ");
		contactService.addContact(addContactDTO);
		return "";
	}
}

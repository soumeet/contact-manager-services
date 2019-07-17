package com.infosys.contactmanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.contactmanager.controller.ContactController;
import com.infosys.contactmanager.dto.AddContactRequestDTO;
import com.infosys.contactmanager.dto.ContactDTO;
import com.infosys.contactmanager.dto.LabelDTO;
import com.infosys.contactmanager.dto.PhotoDTO;
import com.infosys.contactmanager.entity.Contact;
import com.infosys.contactmanager.mapper.ContactMapper;
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
	
	public String addContact(AddContactRequestDTO contact) {
		ContactDTO contactDTO = mapToDTO(contact);
		Contact newContact = contactRepository.save(new ContactMapper().convertToEntity(contactDTO));
		return null;
	}
	
	public ContactDTO mapToDTO(AddContactRequestDTO addContactDTO) {
		ContactDTO contactDTO = new ContactDTO();
		
		contactDTO.setAddresses(addContactDTO.getAddresses());
		contactDTO.setCompany(addContactDTO.getCompany());
		contactDTO.setFirstName(addContactDTO.getFirstName());
		contactDTO.setLastName(addContactDTO.getLastName());
		contactDTO.setMiddleName(addContactDTO.getMiddleName());
		contactDTO.setSuffix(addContactDTO.getSuffix());
		contactDTO.setPhones(addContactDTO.getPhones());
		contactDTO.setEmails(addContactDTO.getEmails());
		PhotoDTO photoDTO = new PhotoDTO();
		photoDTO.setFilepath(addContactDTO.getPhotoPath());
		contactDTO.setPhoto(photoDTO);
		contactDTO.setEmails(addContactDTO.getEmails());
		List<LabelDTO> labelList = new ArrayList<>();
		for(String l: addContactDTO.getLabels()) {
			LabelDTO labelDTO = new LabelDTO();
			labelDTO.setLabelName(l);
			labelList.add(labelDTO);
		}
		contactDTO.setLabels(labelList);
		
		return contactDTO;
	}

}

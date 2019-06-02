package com.infosys.contactmanager.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.infosys.contactmanager.dto.ContactDTO;
import com.infosys.contactmanager.entity.Contact;

public class ContactMapper {

	@Autowired
	ModelMapper modelMapper;
	
	public ContactDTO convertToDTO(Contact contact) {
		ContactDTO contactDTO = modelMapper.map(contact, ContactDTO.class);
		return contactDTO;
	}
}

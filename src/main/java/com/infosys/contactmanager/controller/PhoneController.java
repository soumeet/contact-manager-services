package com.infosys.contactmanager.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.contactmanager.dto.PhoneDTO;
import com.infosys.contactmanager.entity.Phone;
import com.infosys.contactmanager.mapper.PhoneMapper;
import com.infosys.contactmanager.service.PhoneService;

@RestController
@RequestMapping(path="/phone")
public class PhoneController {

	@Autowired
	PhoneService phoneService;
	
	@Autowired
	PhoneMapper phoneMapper;
	
	@GetMapping(path="/getAllNos")
	public List<String> getAllNos(){
		List<String> phoneNumbers = phoneService.getAllNos();
		return phoneNumbers;
	}
	
	@GetMapping(path="/getAllNosForContact", produces="application/json")
	public List<PhoneDTO> getAllNosForContact(@RequestParam("contactId") Integer contactId){
		System.out.println("IN " + PhoneController.class + " getAllNosForContact() contactId: " + contactId);
		List<Phone> phones = phoneService.getAllNosForContact(contactId);
		return phones.stream()
				.map(phone -> phoneMapper.convertToDTO(phone))
				.collect(Collectors.toList());
	}
	
	/*public PhoneDTO convertToDTO(Phone phone) {
		PhoneDTO phoneDTO = modelMapper.map(phone, PhoneDTO.class);
		return phoneDTO;
	}*/
}

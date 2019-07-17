package com.infosys.contactmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.contactmanager.controller.PhoneController;
import com.infosys.contactmanager.entity.Phone;
import com.infosys.contactmanager.repository.PhoneRepository;

@Service
public class PhoneServiceImpl implements PhoneService {

	@Autowired
	PhoneRepository phoneRepository;
	
	@Override
	public List<String> getAllNos() {
		return phoneRepository.getAllNos();
	}

	@Override
	public List<Phone> getAllNosForContact(Integer contactId) {
		return phoneRepository.getAllNosForContact(contactId);
	}

	@Override
	public Phone getPhone(String phoneNumber) {
		return phoneRepository.getOne(phoneNumber);
	}

	public String validatePhoneNumber(String phoneNumber) {
		System.out.println("IN " + PhoneServiceImpl.class + " validatePhoneNumber() phoneNumber: " + phoneNumber);
		if (phoneRepository.findById(phoneNumber).isPresent())
			return "1";
		return "0";
	}
}

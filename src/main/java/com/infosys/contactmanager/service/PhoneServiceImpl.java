package com.infosys.contactmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}

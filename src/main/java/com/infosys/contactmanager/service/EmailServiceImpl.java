package com.infosys.contactmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.contactmanager.repository.EmailRepository;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	EmailRepository emailRepository;
	
	@Override
	public String validateEmailId(String emailId) {
		System.out.println("IN " + EmailServiceImpl.class + " validateEmail() emailId: " + emailId);
		if (emailRepository.findById(emailId).isPresent())
			return "1";
		return "0";
	}

}

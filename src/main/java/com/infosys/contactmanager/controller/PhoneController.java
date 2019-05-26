package com.infosys.contactmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.contactmanager.repository.PhoneRepository;

@RestController
@RequestMapping(path="/phone")
public class PhoneController {

	@Autowired
	PhoneRepository phoneRepository;
	
	@GetMapping(path="/getAllNos", produces="application/json")
	public List<String> getAllNos(){
		List<String> phoneNumbers = phoneRepository.getAllNos();
		return phoneNumbers;
	}
}

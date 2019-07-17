package com.infosys.contactmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.contactmanager.service.EmailService;

@RestController
@RequestMapping(path="/email")
public class EmailController {

	@Autowired
	EmailService emailService;
	
	@GetMapping(path="/validate")
	public String validateEmailId(@RequestParam("emailId") String emailId) {
		System.out.println("IN " + EmailController.class + " validateEmailId() emailId: " + emailId);
		String res = emailService.validateEmailId(emailId);
		return res;
	}
}

 package com.infosys.contactmanager.controller;

import java.util.List;

import java.io.File;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.contactmanager.service.BaseService;

@RestController
@RequestMapping(path="/base")
public class BaseController {

	@Autowired
	BaseService baseService;
	
	@GetMapping(path="/test")
	public String test() {
		File file = new File("D:\\dev\\contact-manager-services\\target\\contactmanager-0.0.1-SNAPSHOT.jar");
		String testData = "Test Successful!";
		if(file.exists()) {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd/MM/yyyy");
			testData = testData + "\nLast Build: " + sdf.format(file.lastModified());
			testData = testData + "\nBuild Path: " + file.getAbsolutePath();
		}
		return testData;
	}
	
	@GetMapping(path="/getAllLabels")
	public List<String> getAllLabels() {
		System.out.println("IN " + BaseController.class + " getAllLabels()");
		List<String> labelList = baseService.getLabelList();
		return labelList;
	}
	
	@GetMapping(path="/getLabelsForContact")
	@ResponseBody
	public List<String> getLabelsForContact(@RequestParam("contactId") Integer contactId) {
		System.out.println("IN " + BaseController.class + " getLabelsForContact() contactId: " + contactId);
		List<String> labelList = baseService.getLabelForContact(contactId);
		return labelList;
	}
}

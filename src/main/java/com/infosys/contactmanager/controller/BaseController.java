package com.infosys.contactmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.contactmanager.dao.BaseDaoImpl;
import com.infosys.contactmanager.service.BaseService;
import com.infosys.contactmanager.service.BaseServiceImpl;

@RestController
@RequestMapping(path="/base")
public class BaseController {

	@Autowired
	BaseService baseService;
	
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

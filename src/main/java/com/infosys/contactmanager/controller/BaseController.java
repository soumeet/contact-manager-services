package com.infosys.contactmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.contactmanager.service.BaseService;

@RestController
@RequestMapping(path="/base")
public class BaseController {

	@Autowired
	BaseService baseService;
	
	@GetMapping(path="/getLabelList", produces="application/json")
	public List<String> getLabelList(){
		List<String> labelList = baseService.getLabelList();
		return labelList;
	}
	
}

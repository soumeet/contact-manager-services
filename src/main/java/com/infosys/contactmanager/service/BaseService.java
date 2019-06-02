package com.infosys.contactmanager.service;

import java.util.List;

import org.springframework.stereotype.Service;

public interface BaseService {

	public List<String> getLabelList();
	
	public List<String> getLabelForContact(Integer contactId);
}

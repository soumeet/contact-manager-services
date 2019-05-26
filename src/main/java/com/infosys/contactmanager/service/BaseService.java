package com.infosys.contactmanager.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface BaseService {

	public List<String> getLabelList();
}

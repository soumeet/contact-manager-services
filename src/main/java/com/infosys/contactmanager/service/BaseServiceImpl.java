package com.infosys.contactmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.contactmanager.dao.BaseDao;
import com.infosys.contactmanager.dao.BaseDaoImpl;

@Service
public class BaseServiceImpl implements BaseService {
	
	@Autowired
	BaseDao baseDao;

	@Override
	public List<String> getLabelList() {
		System.out.println("IN " + BaseServiceImpl.class + " getAllLabels()");
		List<String> labelList = baseDao.getAllLabels();
		return labelList;
	}

	@Override
	public List<String> getLabelForContact(Integer contactId) {
		System.out.println("IN " + BaseServiceImpl.class + " getLabelsForContact() contactId: " + contactId);
		List<String> labelList = baseDao.getLabelsForContact(contactId);
		return labelList;
	}

}

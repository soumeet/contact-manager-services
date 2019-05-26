package com.infosys.contactmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.infosys.contactmanager.dao.BaseDao;

public class BaseServiceImpl implements BaseService {
	
	@Autowired
	BaseDao baseDao;

	@Override
	public List<String> getLabelList() {
		List<String> labelList = baseDao.getAllLabels();
		return labelList;
	}

}

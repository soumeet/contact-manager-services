package com.infosys.contactmanager.dao;

import java.util.List;

public interface BaseDao {

	public List<String> getAllLabels();
	
	public List<String> getLabelsForContact(Integer contactId);
}

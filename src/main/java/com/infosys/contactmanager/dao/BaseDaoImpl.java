package com.infosys.contactmanager.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.infosys.contactmanager.utility.SQLQueries;

@Repository
public class BaseDaoImpl implements BaseDao {
	
	private static final Logger logger = LogManager.getLogger(BaseDaoImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate jdbc;
	@Override
	public List<String> getAllLabels() {
		System.out.println("IN " + BaseDaoImpl.class + " getAllLabels()");
		List<String> labelList = new ArrayList<>();
		String sql = SQLQueries.GET_ALL_LABELS;
		Map<String,Object> paramMap = new HashMap<String,Object>();
		try {
			labelList = jdbc.queryForList(sql, paramMap, String.class);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return labelList;
	}
	@Override
	public List<String> getLabelsForContact(Integer contactId) {
		System.out.println("IN " + BaseDaoImpl.class + " getLabelsForContact() contactId: " + contactId);
		List<String> labelList = new ArrayList<>();
		String sql = SQLQueries.GET_ALL_LABELS;
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("contactId", contactId);
		try {
			labelList = jdbc.queryForList(sql, paramMap, String.class);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return labelList;
	}
}

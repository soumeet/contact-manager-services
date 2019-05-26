package com.infosys.contactmanager.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.infosys.contactmanager.utility.SQLQueries;

public class BaseDaoImpl implements BaseDao {

	private NamedParameterJdbcTemplate jdbc;
	@Override
	public List<String> getAllLabels() {
		List<String> labelList = new ArrayList<>();
		String sql = SQLQueries.GET_ALL_LABELS;
		labelList = jdbc.query(sql, new RowMapper<String>() {
			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString(1);
			}
			
		});
		return labelList;
	}

}

package com.infosys.contactmanager.utility;

public class SQLQueries {

	public final static String GET_ALL_LABELS = "SELECT l.label_name FROM label l";
	
	public final static String GET_ALL_LABELS_BY_CONTACT = "SELECT l.label_name\r\n" + 
			"FROM contact_label cl INNER JOIN label l ON cl.label_id = l.label_id\r\n" + 
			"WHERE cl.contact_id = :contactId";
	
}

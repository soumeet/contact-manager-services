package com.infosys.contactmanager.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.contactmanager.entity.Contact;
import com.infosys.contactmanager.entity.Phone;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	@Query("SELECT c FROM Contact c")
	public List<Contact> getAllContacts();
	
	@Query("SELECT c FROM Contact c WHERE c.contactId = ?1")
	public Contact getContact(Integer contactId);
}

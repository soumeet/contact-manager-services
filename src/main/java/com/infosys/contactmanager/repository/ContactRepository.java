package com.infosys.contactmanager.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.contactmanager.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	public List<Contact> getAllContacts();
	
}

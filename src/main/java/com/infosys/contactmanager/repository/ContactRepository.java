package com.infosys.contactmanager.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.contactmanager.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
}

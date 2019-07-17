package com.infosys.contactmanager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.contactmanager.entity.Email;

public interface EmailRepository extends JpaRepository<Email, String> {
	
	public Optional<Email> findById(String emailId);

}

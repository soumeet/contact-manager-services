package com.infosys.contactmanager.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.contactmanager.entity.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, String> {
	
	@Query("SELECT p.phoneNumber FROM Phone p")
	public List<String> getAllNos();
	
	@Query("SELECT p FROM Phone p WHERE p.contact.contactId = ?1")
	public List<Phone> getAllNosForContact(Integer contactId);
	
	@Query("SELECT 1 FROM Phone p WHERE p.phoneNumber = ?1")
	public Integer validatePhoneNumber(String phoneNumber);
	
	public Optional<Phone> findById(String phoneNumber); 

	public boolean existsById(String phoneNumber);
}

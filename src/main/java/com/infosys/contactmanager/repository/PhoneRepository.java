package com.infosys.contactmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.contactmanager.entity.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, String> {
	
	@Query("SELECT p.phoneNumber FROM Phone p")
	public List<String> getAllNos();
}

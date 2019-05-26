package com.infosys.contactmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.infosys.contactmanager.service"})
public class ContactManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactManagerApplication.class, args);
	}
}

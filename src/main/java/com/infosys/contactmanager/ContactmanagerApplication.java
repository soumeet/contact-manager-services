package com.infosys.contactmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.infosys.contactmanager.controller.BaseController;

@SpringBootApplication
public class ContactManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactManagerApplication.class, args);
	}
}

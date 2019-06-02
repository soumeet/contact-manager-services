package com.infosys.contactmanager.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infosys.contactmanager.mapper.ContactMapper;
import com.infosys.contactmanager.mapper.PhoneMapper;

@Configuration
public class ApplicationConfig {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}
	
	@Bean
	public PhoneMapper phoneMapper() {
		PhoneMapper phoneMapper = new PhoneMapper();
		return phoneMapper;
	}
	
	@Bean
	public ContactMapper contactMapper() {
		ContactMapper contactMapper = new ContactMapper();
		return contactMapper;
	}
}

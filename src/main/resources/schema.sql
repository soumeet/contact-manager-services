-- Database: contact-man

-- DROP DATABASE "contact-man";

CREATE DATABASE "contact-man"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_United States.1252'
    LC_CTYPE = 'English_United States.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

COMMENT ON DATABASE "contact-man"
    IS 'contact-manager database';
	
DROP TABLE photo;
DROP TABLE label;
DROP TABLE contact;
DROP TABLE address;
DROP TABLE phone;

CREATE TABLE photo(
	photo_id SERIAL PRIMARY KEY,
	filepath VARCHAR(200) NOT NULL
);

CREATE TABLE label(
	label_id SERIAL PRIMARY KEY,
	label_name VARCHAR(20) UNIQUE NOT NULL
);

CREATE TABLE contact(
	contact_id SERIAL PRIMARY KEY,
	first_name VARCHAR(50) NOT NULL,
	middle_name VARCHAR(50),
	last_name VARCHAR(50),
	suffix VARCHAR(50),
	company VARCHAR(50),
	photo_id SERIAL REFERENCES photo(photo_id)
);

CREATE TABLE address(
	contact_id SERIAL REFERENCES contact(contact_id),
	address_id SERIAL PRIMARY KEY,
	houseno VARCHAR(200),
	street VARCHAR(200),
	locality VARCHAR(200),
	city VARCHAR(50) NOT NULL,
	pincode VARCHAR(6),
	country  VARCHAR(50),
	address_type VARCHAR(20) NOT NULL
);

CREATE TABLE phone(
	contact_id SERIAL REFERENCES contact(contact_id),
	phone_number VARCHAR(10) PRIMARY KEY,
	phone_type VARCHAR(20) NOT NULL
);

CREATE TABLE contact_label(
	contact_id SERIAL REFERENCES contact(contact_id),
	label_id SERIAL REFERENCES label(label_id),
);
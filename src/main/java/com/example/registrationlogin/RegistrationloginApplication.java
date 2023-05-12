package com.example.registrationlogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class RegistrationloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationloginApplication.class, args);
	}

}

package com.umesh.security.SpringSecuritySample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringSecuritySampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecuritySampleApplication.class, args);
	}
}

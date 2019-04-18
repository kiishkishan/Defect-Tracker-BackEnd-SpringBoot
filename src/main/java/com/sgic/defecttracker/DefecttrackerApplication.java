package com.sgic.defecttracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DefecttrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefecttrackerApplication.class, args);
	}

}

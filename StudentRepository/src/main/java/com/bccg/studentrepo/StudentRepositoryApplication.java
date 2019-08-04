package com.bccg.studentrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class StudentRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRepositoryApplication.class, args);
	}

}

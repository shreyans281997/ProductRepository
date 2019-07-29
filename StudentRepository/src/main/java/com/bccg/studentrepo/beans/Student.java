package com.bccg.studentrepo.beans;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	private Integer studentId;
	private String firstName;
	private String lastName;
	private String emailId;
}

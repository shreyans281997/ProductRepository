package com.bccg.studentrepo.services;

import java.util.List;

import com.bccg.studentrepo.beans.Student;
import com.bccg.studentrepo.exceptions.StudentNotFoundException;

public interface IStudentServices {
	public String acceptStudentDetails(Student student);

	public Student getStudentDetails(Integer studentId) throws StudentNotFoundException;

	public boolean deleteStudentDetails(Integer studentId) throws StudentNotFoundException;

	public List<Student> showAllStudent();

	public Student updateStudentDetails(Student student);
}

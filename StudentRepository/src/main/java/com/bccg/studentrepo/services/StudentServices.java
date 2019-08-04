package com.bccg.studentrepo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bccg.studentrepo.beans.Student;
import com.bccg.studentrepo.dao.StudentDao;
import com.bccg.studentrepo.exceptions.StudentNotFoundException;

@Service
public class StudentServices implements IStudentServices {
	@Autowired
	StudentDao daoServices;

	@Override
	public String acceptStudentDetails(Student student) {
		daoServices.save(student);
		return "Student details saved successfully";
	}

	@Override
	public Student getStudentDetails(Integer studentId) throws StudentNotFoundException {
		return daoServices.findById(studentId).orElseThrow(() -> new StudentNotFoundException("Student Not found"));
	}

	@Override
	public boolean deleteStudentDetails(Integer studentId) throws StudentNotFoundException {
		getStudentDetails(studentId);
		daoServices.deleteById(studentId);
		return true;
	}

	@Override
	public List<Student> showAllStudent() {
		return daoServices.findAll();
	}

	@Override
	public Student updateStudentDetails(Student student) {
		return daoServices.save(student);
	}

}
package com.bccg.studentrepo.services;
import java.util.List;

import com.bccg.studentrepo.beans.Student;
public interface IStudentServices {
public String acceptStudentDetails(Student student);
public Student getStudentDetails(Integer studentId);
public boolean deleteStudentDetails(Integer studentId);
public List<Student> showAllStudent();
public Student updateStudentDetails(Student student);
}

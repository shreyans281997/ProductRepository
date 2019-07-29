package com.bccg.studentrepo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bccg.studentrepo.beans.Student;
import com.bccg.studentrepo.services.StudentServices;
@RestController
@RequestMapping("/student/")
public class StudentController {
	@Autowired
	StudentServices studentServices;
	@PostMapping("/save")
	public ResponseEntity<String> acceptStudentDetails(@RequestBody Student student){
		return new ResponseEntity<>(studentServices.acceptStudentDetails(student),HttpStatus.OK);
	}
	@GetMapping("/studentDetails")
	public ResponseEntity<Student> getStudentDetails(@RequestParam Integer studentId){
		return new ResponseEntity<>(studentServices.getStudentDetails(studentId),HttpStatus.OK);
	}
	@GetMapping(value= {"/info/{id}"})
	public ResponseEntity<Student> getProductDetailsPathParam(@PathVariable(value="id") Integer studentId){
		return new ResponseEntity<>(studentServices.getStudentDetails(studentId),HttpStatus.OK);
	}   @PutMapping("/update")
	public ResponseEntity<Student> updateStudentDetails(@RequestBody Student student){
		return new ResponseEntity<Student>(studentServices.updateStudentDetails(student),HttpStatus.OK);
	}
	@GetMapping("/allStudents")
	public ResponseEntity<List<Student>> getAllStudents(){
		return new ResponseEntity<List<Student>>(studentServices.showAllStudent(), HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public ResponseEntity<Boolean> deleteStudent(@RequestParam Integer studentId){
		return new ResponseEntity<Boolean>(studentServices.deleteStudentDetails(studentId), HttpStatus.OK);
	}

}

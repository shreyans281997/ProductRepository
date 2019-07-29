package com.bccg.studentrepo.aspect;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.bccg.studentrepo.exceptions.StudentNotFoundException;
import com.bccg.studentrepo.response.CustomResponse;
@ControllerAdvice
public class StudentExceptionAspect {
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<CustomResponse> handleStudentNotFoundException(Exception e) {
		CustomResponse response=new CustomResponse(e.getMessage(), HttpStatus.EXPECTATION_FAILED.value());
		return new ResponseEntity<>(response,HttpStatus.EXPECTATION_FAILED);
	}
}

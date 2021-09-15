/**
 * 
 */
package com.api.student.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.student.entity.Student;
import com.api.student.service.StudentService;

/**
 * @author 48 - Tran Trung Vinh - 18079461
 *
 */
@RestController
@RequestMapping("api/students")
public class StudentRestController {
	@Autowired
	StudentService studentService;
	
	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAllStudent();
		
	}
	 @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public Student addNewStudent(@RequestBody Student student) {
	        studentService.save(student);
	        return student;
	    }

	    @PutMapping("/{studentId}")
	    @ResponseStatus(HttpStatus.OK)
	    public Student apdateStudent(@RequestBody Student student, @PathVariable Long studentId) {
	        studentService.save(student);
	        return student;
	    }

	    @DeleteMapping("/{studentId}")
	    @ResponseStatus(HttpStatus.OK)
	    public String deleteStudent(@PathVariable Long studentId) {
	        studentService.delete(studentId);
	        return "deleted Student id =" + studentId;
	    }

}

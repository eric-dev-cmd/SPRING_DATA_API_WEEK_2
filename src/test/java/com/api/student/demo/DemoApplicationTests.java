package com.api.student.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.student.service.StudentService;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private StudentService studentService;
	@Test
	void contextLoads() {
	}
	@Test
	public void getAllStudent(){
		System.out.println(studentService.getAllStudent());
	}

//	@Test
//	public void addEmployee(){
//		student.addEmployee(new Employee());
//	}

}

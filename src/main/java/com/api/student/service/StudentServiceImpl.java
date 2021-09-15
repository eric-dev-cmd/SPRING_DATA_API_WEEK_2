/**
 * 
 */
package com.api.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.student.entity.Student;
import com.api.student.repository.StudentRepository;

/**
 * @author 48 - Tran Trung Vinh - 18079461
 *
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
	@Override
	public List<Student> getAllStudent() {
		 return studentRepository.findAll();
	}

	@Override
	public Student findById(Long theId) {
		 return studentRepository.findById(theId).orElse(null);
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		 studentRepository.save(student);
	}

	@Override
	public void delete(Long studentId) {
		// TODO Auto-generated method stub
	      studentRepository.deleteById(studentId);
	}

}

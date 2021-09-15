/**
 * 
 */
package com.api.student.service;

import java.util.List;

import com.api.student.entity.Student;


/**
 * @author 48 - Tran Trung Vinh - 18079461
 *
 */
public interface StudentService {
    public List<Student> getAllStudent();
    public Student findById(Long theId);
    public void save(Student student);
    public void delete(Long studentId); 
    }

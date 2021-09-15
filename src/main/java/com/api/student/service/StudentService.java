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
    public List<Student> findAll();
    public Student findById(int theId);
    public void save(Student theEmployee);
    public void deleteById(int theId); 
    }

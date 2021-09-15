/**
 * 
 */
package com.api.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.student.entity.Student;

/**
 * @author 48 - Tran Trung Vinh - 18079461
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}

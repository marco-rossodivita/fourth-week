package com.corso.java.repository;

import com.corso.java.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Christian Chiama (c.chiama@silensec.com)
 * @project-Name: corso-java
 * @date: 14-04-2022
 * @time: 14:15 min
 * @file: com.corso.java.repository.StudentRepository
 */

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {
}

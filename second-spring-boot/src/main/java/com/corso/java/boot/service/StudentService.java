package com.corso.java.boot.service;

import com.corso.java.boot.model.Student;
import com.mongodb.DBCollection;

import java.util.List;

/**
 * @author regcrix
 */
public interface StudentService {

   List<Student> findAll();

   Student findByStudentNumber(long studentNumber);

   Student findByEmail(String email);

   List<Student> findAllByOrderByGpaDesc();

   Student saveOrUpdateStudent(Student student);

   void deleteStudentById(String id);

   void update(DBCollection collection);

}

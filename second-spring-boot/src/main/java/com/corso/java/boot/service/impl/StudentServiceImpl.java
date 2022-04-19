package com.corso.java.boot.service.impl;

import com.corso.java.boot.model.Student;
import com.corso.java.boot.repository.StudentRepository;
import com.corso.java.boot.service.StudentService;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ragcrix
 */
@Service
public class StudentServiceImpl implements StudentService {

   @Autowired
   private StudentRepository studentRepository;

   @Override
   public List<Student> findAll() {
      return studentRepository.findAll();
   }

   @Override
   public Student findByStudentNumber(long studentNumber) {
      return studentRepository.findByStudentNumber(studentNumber);
   }

   @Override
   public Student findByEmail(String email) {
      return studentRepository.findByEmail(email);
   }

   @Override
   public List<Student> findAllByOrderByGpaDesc() {
      return studentRepository.findAllByOrderByGpaDesc();
   }

   @Override
   public Student saveOrUpdateStudent(Student student) {
      return studentRepository.save(student);
   }

   @Override
   public void deleteStudentById(String id) {
      studentRepository.deleteById(id);
   }

   @Override
   public void update(DBCollection collection) {
      BasicDBObject dbObject = new BasicDBObject();
      dbObject.append("$set", new BasicDBObject().append("name", "Pippo"));

      BasicDBObject searchQuery = new BasicDBObject().append("lastName", "Pippo2");
      collection.update(searchQuery, dbObject);
   }
}

package com.corso.java.boot.controller;

import com.corso.java.boot.dto.StudentDTO;
import com.corso.java.boot.model.Student;
import com.corso.java.boot.service.StudentService;
import com.corso.java.boot.util.ObjectMapperUtils;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ragcrix
 */
@RestController
@RequestMapping("/students")
public class StudentRestController {

   @Autowired
   private StudentService studentService;

   @GetMapping(value = "/")
   public List<StudentDTO> getAllStudents() {
      return ObjectMapperUtils.mapAll(studentService.findAll(), StudentDTO.class);
   }

   @GetMapping(value = "/byStudentNumber/{studentNumber}")
   public StudentDTO getStudentByStudentNumber(@PathVariable("studentNumber") Long studentNumber) {
      return ObjectMapperUtils.map(studentService.findByStudentNumber(studentNumber), StudentDTO.class);
   }

   @PutMapping(value = "/{id}")
   public ResponseEntity<?> update(@PathVariable("id") String id) {

      Mongo mongo = new Mongo("localhost", 27017);
      DB db = mongo.getDB("corso");
      DBCollection dbCollection = db.getCollection("CompactDisk");

      studentService.update(dbCollection);


      return ResponseEntity.ok(HttpStatus.OK);
   }

   @GetMapping(value = "/byEmail/{email}")
   public StudentDTO getStudentByEmail(@PathVariable("email") String email) {
      return ObjectMapperUtils.map(studentService.findByEmail(email), StudentDTO.class);
   }

   @GetMapping(value = "/orderByGpa")
   public List<StudentDTO> findAllByOrderByGpaDesc() {
      return ObjectMapperUtils.mapAll(studentService.findAllByOrderByGpaDesc(), StudentDTO.class);
   }

   @PostMapping(value = "/save")
   public ResponseEntity<?> saveOrUpdateStudent(@RequestBody StudentDTO studentDTO) {
      studentService.saveOrUpdateStudent(ObjectMapperUtils.map(studentDTO, Student.class));
      return new ResponseEntity("Student added successfully", HttpStatus.OK);
   }

   @DeleteMapping(value = "/delete/{studentNumber}")
   public ResponseEntity<?> deleteStudentByStudentNumber(@PathVariable long studentNumber) {
      studentService.deleteStudentById(studentService.findByStudentNumber(studentNumber).getId());
      return new ResponseEntity("Student deleted successfully", HttpStatus.OK);
   }

}

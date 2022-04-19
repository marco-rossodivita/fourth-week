package com.corso.java.service;

import com.corso.java.domain.Student;
import com.corso.java.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class StudentServiceImpl implements StudentService{

   @Autowired
   StudentRepository studentRepository;


   @Override
   public Optional<Student> findById(String id) {

      return studentRepository.findById(id);
   }

   @Override
   public List<Student> findAll() {
      return null;
   }

   @Override
   public void deleteById(String id) {
      studentRepository.deleteById(id);
   }
}

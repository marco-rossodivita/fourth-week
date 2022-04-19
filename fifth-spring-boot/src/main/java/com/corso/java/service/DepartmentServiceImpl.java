package com.corso.java.service;

import com.corso.java.domain.Department;
import com.corso.java.domain.Student;
import com.corso.java.repository.DepartmentRepository;
import com.corso.java.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    DepartmentRepository departmentRepository;


    @Override
    public Optional<Department> findById(String id) {

        return departmentRepository.findById(id);
    }

    @Override
    public List<Department> findAll() {
        return null;
    }

    @Override
    public void deleteDepartmentById(String id) {
        departmentRepository.deleteById(id);
    }



}

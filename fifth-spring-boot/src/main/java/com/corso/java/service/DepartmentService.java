package com.corso.java.service;

import com.corso.java.domain.Department;
import com.corso.java.domain.Student;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    Optional<Department> findById(String id);

    List<Department> findAll();

    void deleteDepartmentById(String id);

}

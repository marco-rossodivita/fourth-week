package com.corso.java.repository;

import com.corso.java.domain.Department;
import com.corso.java.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, String> {


    @Query("SELECT d FROM Department d WHERE d.name = ?1")
    Optional<Department> findDepartmentByName(String name);
}

package com.corso.java.controller;

import com.corso.java.domain.Department;
import com.corso.java.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> findAll(){
        return departmentService.findAll();
    }

    @GetMapping("/departments/{id}")
    public Optional<Department> findById(@PathVariable("id") String id){
        return departmentService.findById(id);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") String departmentId)
    {
        departmentService.deleteDepartmentById(
                departmentId);

        return "Deleted Successfully";
    }


}

package com.corso.java.controller;

import com.corso.java.domain.User;
import com.corso.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path = "/{id}")
    ResponseEntity<User> findById(@PathVariable String id){

        Optional<User> student = userService.findById(id);
        return new  ResponseEntity<User>(userService.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping(path = "/")
    ResponseEntity<List<User>> findAll(){

        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    ResponseEntity<Void> deleteById(@PathVariable String id){
        userService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}

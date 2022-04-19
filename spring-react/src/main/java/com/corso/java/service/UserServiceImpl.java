package com.corso.java.service;

import com.corso.java.domain.User;
import com.corso.java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepo;


    @Override
    public Optional<User> findById(String id) {

        return userRepo.findById(id);
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void deleteById(String id) {
        userRepo.deleteById(id);
    }
}

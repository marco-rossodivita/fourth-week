package com.corso.java.service;

import com.corso.java.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> findById(String id);

    List<User> findAll();

    void deleteById(String id);
}

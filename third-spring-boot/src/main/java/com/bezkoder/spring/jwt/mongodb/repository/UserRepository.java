package com.bezkoder.spring.jwt.mongodb.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.spring.jwt.mongodb.models.User;

public interface UserRepository extends MongoRepository<User, String> {

@Autowired
  MongoOperation mongo;

  Optional<User> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
}

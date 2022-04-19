package com.corso.java.boot.repository;

import com.corso.java.boot.domain.CompactDisk;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Christian Chiama (c.chiama@silensec.com)
 * @project-Name: first-spring-boot
 * @date: 13-04-2022
 * @time: 11:48 min
 * @file: com.corso.java.boot.repository.CompactDiskRepository
 */

@Repository
public interface CompactDiskRepository  extends MongoRepository<CompactDisk, String> {
}

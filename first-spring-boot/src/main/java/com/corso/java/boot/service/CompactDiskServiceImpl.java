package com.corso.java.boot.service;

import com.corso.java.boot.domain.CompactDisk;
import com.corso.java.boot.repository.CompactDiskRepository;
import com.corso.java.boot.service.api.CompactDiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author: Christian Chiama (c.chiama@silensec.com)
 * @project-Name: first-spring-boot
 * @date: 13-04-2022
 * @time: 11:47 min
 * @file: com.corso.java.boot.service.CompactDiskServiceImpl
 */

@Service
public class CompactDiskServiceImpl implements CompactDiskService {

   @Autowired
   CompactDiskRepository compactDiskRepository;

   @Override
   public List<CompactDisk> findAll() {
      return compactDiskRepository.findAll();
   }

   @Override
   public CompactDisk create(CompactDisk compactDisk){
      return compactDiskRepository.save(compactDisk);
   }

   public CompactDisk updateById(String id,CompactDisk compactDisk) {
      Optional<CompactDisk> compactDisk1 = compactDiskRepository.findById(id);
      compactDisk1.get().setAge(compactDisk.getAge());
      compactDisk1.get().setAuthor(compactDisk.getAuthor());
      compactDisk1.get().setDescription(compactDisk.getDescription());
      compactDisk1.get().setName(compactDisk.getName());
      compactDisk1.get().setTitle(compactDisk.getTitle());
      compactDiskRepository.save(compactDisk1.get());
      return compactDisk;
   }
}

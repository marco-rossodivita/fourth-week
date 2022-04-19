package com.corso.java.boot.service.api;

import com.corso.java.boot.domain.CompactDisk;

import java.util.List;

/**
 * @author: Christian Chiama (c.chiama@silensec.com)
 * @project-Name: first-spring-boot
 * @date: 13-04-2022
 * @time: 11:45 min
 * @file: com.corso.java.boot.service.api.CompactDiskService
 */

public interface CompactDiskService {

   List<CompactDisk> findAll();
   CompactDisk create(CompactDisk compactDisk);
   CompactDisk updateById(String id,CompactDisk compactDisk);

}

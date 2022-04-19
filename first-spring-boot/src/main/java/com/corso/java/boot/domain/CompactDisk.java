package com.corso.java.boot.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author: Christian Chiama (c.chiama@silensec.com)
 * @project-Name: first-spring-boot
 * @date: 13-04-2022
 * @time: 11:20 min
 * @file: com.corso.java.boot.domain.CompactDisk
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "CompactDisk")
public class CompactDisk {

   @Id
   private String id;
   private String name;
   private String title;
   private String description;
   private String author;
   private int age;


}

package com.corso.java.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author: Christian Chiama (c.chiama@silensec.com)
 * @project-Name: fourth-spring-boot
 * @date: 14-04-2022
 * @time: 10:30 min
 * @file: com.corso.java.domain.Book
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "books")
public class Book {

   @Id
   private Integer id;

   private String name;
   private Integer pages;
   private String author;
   private Double cost;
}
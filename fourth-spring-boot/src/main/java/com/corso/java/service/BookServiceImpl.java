package com.corso.java.service;

import com.corso.java.domain.Book;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

/**
 * @author: Christian Chiama (c.chiama@silensec.com)
 * @project-Name: fourth-spring-boot
 * @date: 14-04-2022
 * @time: 11:25 min
 * @file: com.corso.java.service.BookServiceImpl
 */

@Service
public class BookServiceImpl implements BookService{

   @Autowired
   MongoTemplate mongoTemplate;


   @Override
   public void updateSpecificField(String name, String value) {
      Query query = new Query(Criteria.where("name").is(name));
      Update update = new Update();
      update.set("name",value);

      UpdateResult result = mongoTemplate.updateFirst(query, update, Book.class);
      System.out.println(("Record modificati:" + result.getMatchedCount()));
   }
}

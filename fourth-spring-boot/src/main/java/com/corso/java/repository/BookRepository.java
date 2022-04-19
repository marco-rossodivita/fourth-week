package com.corso.java.repository;

import com.corso.java.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author: Christian Chiama (c.chiama@silensec.com)
 * @project-Name: fourth-spring-boot
 * @date: 14-04-2022
 * @time: 10:33 min
 * @file: com.corso.java.repository.BookRepository
 */

@Repository
public interface BookRepository extends MongoRepository<Book,Integer> {

   //SQL Equivalent : SELECT * FROM BOOK WHERE ID=?
   @Query("{id :?0}")
   Optional<Book> getBookById(Integer id);

   // SQL Equivalent : SELECT * FROM BOOK where pages<?
   @Query("{pages : {$lt: ?0}}")
   List<Book> getBooksByPages(Integer pages);

   @Query("{author : ?0}")                                         // SQL Equivalent : SELECT * FROM BOOK where author = ?
   List<Book> getBooksByAuthor(String author);


   @Query("{author: ?0, cost: ?1}")                            // SQL Equivalent : SELECT * FROM BOOK where author = ? and cost=?
      //@Query("{$and :[{author: ?0},{cost: ?1}] }")
   List<Book> getBooksByAuthorAndCost(String author, Double cost);


   @Query("{$or :[{author: ?0},{name: ?1}]}")            //SQL Equivalent : select count(*) from book where author=? or name=?
   List<Book> getBooksByAuthorOrName(String author, String name);


   @Query(value ="{author: ?0}", count=true)           //SQL Equivalent : select count(*) from book where author=?
   Integer getBooksCountByAuthor(String author);

   //Sorting
   @Query(value = "{author:?0}", sort= "{name:1}") //ASC
   //@Query(value = "{author=?0}", sort= "{name:-1}") //DESC
   List<Book> getBooksByAuthorSortByName(String author);

   //------------------- @Query with Projection ---------------------------------------
   @Query(value= "{pages: ?0}", fields="{name:1, author:1}")   // only data of name & author properties will be displayed
   //@Query(value= "{pages: ?0}", fields="{name:1, author:1, cost:1, pages:1}") // will display all properties data
   List<Book> getBookNameAndAuthorByPages(Integer pages);


   @Query(value= "{author : ?0}")           // SQL Equivalent : SELECT * FROM BOOK select * from books where author=?
   List<Book> getAllBooksByAuthor(String author);

   //------------------MongoDB Regular Expressions--------------------------------------
   @Query("{ author : { $regex : ?0 } }")
   List<Book> getBooksByAuthorRegEx(String author);



}

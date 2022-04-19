package com.corso.java.controller;

import com.corso.java.domain.Book;
import com.corso.java.repository.BookRepository;
import com.corso.java.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Christian Chiama (c.chiama@silensec.com)
 * @project-Name: fourth-spring-boot
 * @date: 14-04-2022
 * @time: 10:43 min
 * @file: com.corso.java.controller.BokkController
 */

@RestController
@RequestMapping(path = "/api/v1")
public class BookController {

   @Autowired
   BookRepository bookRepository;

   @Autowired
   BookService bookService;

   @GetMapping(path = "/{id}")
   public ResponseEntity<Book> getBookById(@PathVariable Integer id) {
      return new ResponseEntity(bookRepository.getBookById(id), HttpStatus.OK);
   }

   @GetMapping(path = "/pages")
   public ResponseEntity<List<Book>> getBooksByPages(@RequestParam Integer pages) {
      return new ResponseEntity(bookRepository.getBooksByPages(pages), HttpStatus.OK);
   }

   @PutMapping(path = "/{id}")
   public ResponseEntity<?> update(@PathVariable(name = "id") Integer id, @RequestParam String name, @RequestParam String value) {
      bookService.updateSpecificField(name,value);
      return new ResponseEntity("Record aggiornato con successo", HttpStatus.OK);
   }

}

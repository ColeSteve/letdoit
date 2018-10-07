package com.colesteve.letdoit.service.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.colesteve.letdoit.common.api.entities.Books;
import com.colesteve.letdoit.service.provider.service.BookService;

@RestController
public class BookController {
   @Autowired
   private BookService bookService;
   
   @RequestMapping(value="/book/get/{id}",method=RequestMethod.GET)
   public Books getBookById(@PathVariable("id") String id) {
	   System.out.println("9003-serviceProvider");
	   return bookService.getBookById(id);
   };
	
   @RequestMapping(value="/book/list",method=RequestMethod.GET)
   public List<Books> listBooks(){
		return bookService.listBooks(); 
   };
	
   @RequestMapping(value="/book/add",method=RequestMethod.POST)
   public boolean addBook(Books books) {
		return bookService.addBook(books);
   };
   
}

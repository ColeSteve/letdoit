package com.colesteve.letdoit.hystrix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.colesteve.letdoit.common.api.entities.Books;
import com.colesteve.letdoit.hystrix.service.BookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class BookController {
   @Autowired
   private BookService bookService;
   
   @RequestMapping(value="/book/get/{id}",method=RequestMethod.GET)
   @HystrixCommand(fallbackMethod="getBookFallback")
   public Books getBookById(@PathVariable("id") String id) {
	   System.out.println("9003-serviceProvider");
	   if("1".equals(id)) {
		   throw new RuntimeException("手动抛出异常...");
	   }
	   return bookService.getBookById(id);
   };
	
   /**
    * 
    * @param id
    * @return
    *   返回类型必须是主方法的类型或其子类型
    */
   public Books getBookFallback(@PathVariable("id") String id) {
	   Books book = new Books();
	   return book;
   }
   @RequestMapping(value="/book/list",method=RequestMethod.GET)
   public List<Books> listBooks(){
		return bookService.listBooks(); 
   };
	
   @RequestMapping(value="/book/add",method=RequestMethod.POST)
   public boolean addBook(Books books) {
		return bookService.addBook(books);
   };
   
}

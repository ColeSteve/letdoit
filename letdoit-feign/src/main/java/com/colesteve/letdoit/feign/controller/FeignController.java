package com.colesteve.letdoit.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colesteve.letdoit.common.api.entities.Books;
import com.colesteve.letdoit.common.api.service.BookService;

@RestController
public class FeignController {
    @Autowired
	private BookService bookService;
	
	@RequestMapping(value="/book/get/{id}")
	public Books get(@PathVariable("id") String id)
	{
	   return bookService.getBookById(id);
	}
}

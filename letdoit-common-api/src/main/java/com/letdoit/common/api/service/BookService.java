package com.letdoit.common.api.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.letdoit.common.api.entities.Books;

public interface BookService {
	@RequestMapping(value="/book/get/{id}",method=RequestMethod.GET)
    public Books getBookById(@PathVariable("id") String id);
	
	@RequestMapping(value="/book/list",method=RequestMethod.GET)
    public List<Books> listBooks();
	
	@RequestMapping(value="/book/add",method=RequestMethod.POST)
    public boolean addBook(Books books);
}

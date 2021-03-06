package com.colesteve.letdoit.hystrix.service;

import java.util.List;

import com.colesteve.letdoit.common.api.entities.Books;

public interface BookService {
    public Books getBookById(String id);
    public List<Books> listBooks();
    public boolean addBook(Books books);
}

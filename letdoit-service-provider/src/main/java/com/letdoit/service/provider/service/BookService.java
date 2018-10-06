package com.letdoit.service.provider.service;

import java.util.List;

import com.letdoit.common.api.entities.Books;

public interface BookService {
    public Books getBookById(String id);
    public List<Books> listBooks();
    public boolean addBook(Books books);
}

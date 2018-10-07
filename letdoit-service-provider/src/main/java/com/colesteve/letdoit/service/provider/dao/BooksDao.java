package com.colesteve.letdoit.service.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.colesteve.letdoit.common.api.entities.Books;

@Mapper
public interface BooksDao {
	public Books getBookById(String id);
    public List<Books> listBooks();
    public boolean addBook(Books books);
}

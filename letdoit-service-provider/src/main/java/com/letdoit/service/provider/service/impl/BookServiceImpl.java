package com.letdoit.service.provider.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letdoit.common.api.entities.Books;
import com.letdoit.service.provider.dao.BooksDao;
import com.letdoit.service.provider.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
    private BooksDao booksDao;
	@Override
	public Books getBookById(String id) {
		return booksDao.getBookById(id);
	}

	@Override
	public List<Books> listBooks() {
		return booksDao.listBooks();
	}

	@Override
	public boolean addBook(Books books) {
		return booksDao.addBook(books);
	}

}

package com.colesteve.letdoit.common.api.service.fallbackFactory;

import java.util.List;

import org.springframework.stereotype.Component;

import com.colesteve.letdoit.common.api.entities.Books;
import com.colesteve.letdoit.common.api.service.BookService;

import feign.hystrix.FallbackFactory;

/**
 * 
 * @author colesteve
 *  必须加上Component注解
 */
@Component
public class BookServiceFallbackFactory implements FallbackFactory<BookService>{

	@Override
	public BookService create(Throwable cause) {
		return new BookService() {
			
			@Override
			public List<Books> listBooks() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Books getBookById(String id) {
				System.out.println("common fallback method");
				return null;
			}
			
			@Override
			public boolean addBook(Books books) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}

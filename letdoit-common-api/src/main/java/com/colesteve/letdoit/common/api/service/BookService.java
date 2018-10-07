package com.colesteve.letdoit.common.api.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.colesteve.letdoit.common.api.entities.Books;
import com.colesteve.letdoit.common.api.service.fallbackFactory.BookServiceFallbackFactory;
/**
 * 
 * @author colesteve
 * @decription
 *   FeignClient注释接口 ,参数value是注册到eureka服务中的服务实例名称
 *   fallbackFactory:指定统一的异常处理方法
 */
@FeignClient(value="LETDOIT-SERVICE-PROVIDER",fallbackFactory=BookServiceFallbackFactory.class)
public interface BookService {
	@RequestMapping(value="/book/get/{id}",method=RequestMethod.GET)
    public Books getBookById(@PathVariable("id") String id);
	
	@RequestMapping(value="/book/list",method=RequestMethod.GET)
    public List<Books> listBooks();
	
	@RequestMapping(value="/book/add",method=RequestMethod.POST)
    public boolean addBook(Books books);
}

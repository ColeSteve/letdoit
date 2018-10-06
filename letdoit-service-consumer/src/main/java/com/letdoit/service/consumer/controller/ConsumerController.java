package com.letdoit.service.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.letdoit.common.api.entities.Books;

/**
 * 
 * @author colesteve
 * restTemplate远程调用provider方法
 */
@RestController
public class ConsumerController {
	//远程service-provider地址
	private static final String REST_URL_PREFIX="http://localhost:9001";
    @Autowired
	private RestTemplate restTemplate;
    
    
    @RequestMapping(value="/book/get/{id}",method=RequestMethod.GET)
    public Books getBookById(@PathVariable("id") String id) {
       Books book = restTemplate.getForObject(REST_URL_PREFIX+"/book/get/"+id, Books.class);
 	   return book;
    };
 	
    @SuppressWarnings("unchecked")
	@RequestMapping(value="/book/list",method=RequestMethod.GET)
    public List<Books> listBooks(){
 		return (List<Books>) restTemplate.getForEntity(REST_URL_PREFIX+"/book/list", List.class);
    };
 	
    @RequestMapping(value="/book/add",method=RequestMethod.POST)
    public boolean addBook(Books books) {
 		return restTemplate.postForObject(REST_URL_PREFIX+"/book/add",books, Boolean.class);
    };
}

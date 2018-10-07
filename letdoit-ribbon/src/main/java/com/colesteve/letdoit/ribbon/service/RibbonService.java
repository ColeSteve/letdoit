package com.colesteve.letdoit.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.colesteve.letdoit.common.api.entities.Books;

@Service
public class RibbonService {

	@Autowired
	RestTemplate restTemplate;

	public String getRibbonInfo(String ribbonUrl) {
		return restTemplate.getForObject(ribbonUrl, String.class);
	}

	public Books getBookById(String url, Class<Books> bookClass) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject(url, bookClass);
	}
	
	
}

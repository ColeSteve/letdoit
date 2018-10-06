package com.letdoit.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

	@Autowired
	RestTemplate restTemplate;

	public String getRibbonInfo(String ribbonUrl) {
		return restTemplate.getForObject(ribbonUrl, String.class);
	}
	
	
}

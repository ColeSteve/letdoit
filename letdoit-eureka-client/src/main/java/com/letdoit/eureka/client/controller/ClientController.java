package com.letdoit.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@RequestMapping("/registryInfo")
	public String registryInfo(@RequestParam(value="name") String name) {
		return name +",Welcome to Eureka....";
	}
}

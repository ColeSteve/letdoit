package com.colesteve.letdoit.service.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceProviderApplication {

	public static void main(String[] args) {
	   System.out.println("ServiceProviderApplication is starting...");
	   SpringApplication.run(ServiceProviderApplication.class, args);
	   System.out.println("ServiceProviderApplication start success...");
	}

}

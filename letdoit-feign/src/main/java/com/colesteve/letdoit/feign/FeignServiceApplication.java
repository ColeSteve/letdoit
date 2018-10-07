package com.colesteve.letdoit.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
//
@EnableFeignClients(basePackages= {"com.colesteve.letdoit"})
@ComponentScan(basePackages= {"com.colesteve.letdoit"})
public class FeignServiceApplication {

	public static void main(String[] args) {
		System.out.println("FeignServiceApplication is Starting...");
		SpringApplication.run(FeignServiceApplication.class, args);
		System.out.println("FeignServiceApplication Start Success...");
	}

}

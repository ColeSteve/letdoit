package com.letdoit.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class RibbonApplication {
  public static void main(String[] args) {
	 System.out.println("Ribbon is Starting ...");
	SpringApplication.run(RibbonApplication.class, args);
	 System.out.println("Ribbon Start Success...");
  }
}

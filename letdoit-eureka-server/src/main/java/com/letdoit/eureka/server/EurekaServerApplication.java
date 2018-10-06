package com.letdoit.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
//@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class EurekaServerApplication {
  public static void main(String[] args) {
	 System.out.println("Eureka Server is Starting ....");
	 SpringApplication.run(EurekaServerApplication.class,args);
	 System.out.println("Eureka Server Start Success ....");
  }
}

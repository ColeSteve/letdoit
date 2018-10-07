package com.colesteve.letdoit.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//启动服务后，扫描配置文件，自动注册到eureka服务端
@EnableEurekaClient
//添加熔断器注解
@EnableCircuitBreaker
public class HystrixServiceApplication {

	public static void main(String[] args) {
		System.out.println("HystrixServiceApplication Is Starting...");
        SpringApplication.run(HystrixServiceApplication.class, args);
		System.out.println("HystrixServiceApplication Start Success...");
	}

}

package com.colesteve.letdoit.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//启动服务后，扫描配置文件，自动注册到eureka服务端
@EnableEurekaClient
public class ServiceProviderApplication {

	public static void main(String[] args) {
		System.out.println("ServiceProviderApplication Is Starting...");
        SpringApplication.run(ServiceProviderApplication.class, args);
		System.out.println("ServiceProviderApplication Start Success...");
	}

}

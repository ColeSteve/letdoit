package com.colesteve.letdoit.zuul;

import javax.swing.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//添加zuul依赖注解
@EnableZuulProxy
public class ZuulApplication {

	public static void main(String[] args) {
		System.out.println("ZuulApplication is starting...");
		SpringApplication.run(ZuulApplication.class, args);
		System.out.println("ZuulApplication start success...");
	}

}

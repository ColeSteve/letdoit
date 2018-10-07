package com.colesteve.letdoit.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
//添加HystrixDashboard注解
@EnableHystrixDashboard
public class HystrixDashboardApplication {
  public static void main(String[] args) {
	System.out.println("HystrixDashboardApplication is starting...");
	SpringApplication.run(HystrixDashboardApplication.class, args);
	System.out.println("HystrixDashboardApplication start success...");
  }
}

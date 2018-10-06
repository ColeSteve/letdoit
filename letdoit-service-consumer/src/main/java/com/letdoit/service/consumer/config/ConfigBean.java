package com.letdoit.service.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
  
	/**
	 * restTemplate封装了多种访问远程Http方法
	 * spring集成封装的restful服务模板类
	 * @return
	 */
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}

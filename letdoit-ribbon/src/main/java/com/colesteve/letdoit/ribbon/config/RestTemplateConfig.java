package com.colesteve.letdoit.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
   /**
    * @LoadBalanced 增加负载均衡策略
    */
   @Bean
   @LoadBalanced
   public RestTemplate getRestTemplate() {
	   return new RestTemplate();
   }
}

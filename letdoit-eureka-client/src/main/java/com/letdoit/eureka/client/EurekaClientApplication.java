package com.letdoit.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "Eureka Client is Starting...." );
        SpringApplication.run(EurekaClientApplication.class, args);
        System.out.println( "Eureka Client Start Success...." );

    }
}

package com.flipkartshop.vendorsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableAutoConfiguration
@ComponentScan("com.flipkartshop.vendorsapi")
@Configuration
@EnableMongoRepositories("com.flipkartshop.vendorsapi")

public class VendorsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorsApiApplication.class, args);
		
		System.out.println("hello world");
		
	}

}

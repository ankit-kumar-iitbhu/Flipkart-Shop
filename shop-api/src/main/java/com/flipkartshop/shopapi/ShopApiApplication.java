package com.flipkartshop.shopapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.flipkartshop.shopapi")
@Configuration
@EnableMongoRepositories("com.flipkartshop.shopapi")

//@EnableJpaRepositories("com.flipkartshop.shopapi")

public class ShopApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShopApiApplication.class, args);
		System.out.println("hello world");
	}

}

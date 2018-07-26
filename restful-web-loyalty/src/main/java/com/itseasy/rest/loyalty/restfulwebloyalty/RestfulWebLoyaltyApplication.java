package com.itseasy.rest.loyalty.restfulwebloyalty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@EnableFeignClients("com.itseasy.rest.retailer.restfulwebretailer")
@SpringBootApplication
public class RestfulWebLoyaltyApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebLoyaltyApplication.class, args);
	}
}

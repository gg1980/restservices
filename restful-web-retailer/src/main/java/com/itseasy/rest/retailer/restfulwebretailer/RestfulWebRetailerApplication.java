package com.itseasy.rest.retailer.restfulwebretailer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@EnableFeignClients("com.itseasy.rest.retailer.restfulwebretailer")
@SpringBootApplication
public class RestfulWebRetailerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebRetailerApplication.class, args);
	}
}

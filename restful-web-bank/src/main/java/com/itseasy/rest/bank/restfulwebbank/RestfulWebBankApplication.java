package com.itseasy.rest.bank.restfulwebbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.itseasy.rest.bank.restfulwebbank")
@SpringBootApplication
public class RestfulWebBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebBankApplication.class, args);
	}
}

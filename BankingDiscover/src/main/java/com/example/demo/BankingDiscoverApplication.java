package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.banking.controller")
@ComponentScan("com.banking.ao")
@ComponentScan("com.banking.service")
@ComponentScan("com.banking.bo")

@SpringBootApplication
public class BankingDiscoverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingDiscoverApplication.class, args);
	}

}

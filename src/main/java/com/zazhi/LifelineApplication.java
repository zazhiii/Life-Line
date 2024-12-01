package com.zazhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan(basePackages = "com.example.lifeline.model")
public class LifelineApplication {
	public static void main(String[] args) {
		SpringApplication.run(LifelineApplication.class, args);
	}
}

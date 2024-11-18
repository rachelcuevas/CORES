package com.Rachel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.Rachel")
public class PeliculasYDirectoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeliculasYDirectoresApplication.class, args);
	}

}

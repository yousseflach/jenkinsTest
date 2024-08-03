package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

	public static Logger logger = LoggerFactory.getLogger(Application.class);

	@PostConstruct
	public void init(){
		logger.info("Application started...");
	}

	public static void main(String[] args) {
		logger.info("Application executed success...");
		SpringApplication.run(Application.class, args);
	}

}

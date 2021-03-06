package com.java.saroj.springboot.jenkin.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	public void init() {
		logger.info("Application Started......");
		
	}

	public static void main(String[] args) {
		logger.info("Application executed......");
		logger.info("Application execution Started**************************************");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}

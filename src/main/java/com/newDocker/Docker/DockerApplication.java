package com.newDocker.Docker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import java.util.Date;

@SpringBootApplication

public class DockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);

		Logger logger = LoggerFactory.getLogger(DockerApplication.class);

		logger.info("i am from logger" + new Date());

	}

}

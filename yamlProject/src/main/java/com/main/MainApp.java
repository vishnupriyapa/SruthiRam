package com.main;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MainApp {
	private static final Logger logger=LoggerFactory.getLogger(MainApp.class);
public static void main(String[] args) {
	SpringApplication.run(MainApp.class, args);
	logger.error("Message logged at ERROR level");
    logger.warn("Message logged at WARN level");
    logger.info("Message logged at INFO level");
    logger.debug("Message logged at DEBUG level");
}
}

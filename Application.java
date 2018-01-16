package com.vasudha.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main application to run boot application.
 * 
 * @author Vasudha Jasti
 * @version 1.0
 */
@SpringBootApplication
@ComponentScan(basePackages="com.vasudha")
public class Application {
    public static void main(String[] args) throws Exception {       
        SpringApplication.run(Application.class, args);
    }
}
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.log4j.Log4j;

@Log4j
@SpringBootApplication
@ComponentScan("com.example.demo")
@ComponentScan("com.example.home")
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
    String port = context.getEnvironment().getProperty("server.port");
    log.info("http://localhost:" + port);
	}
}

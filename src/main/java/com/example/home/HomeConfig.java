package com.example.home;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HomeConfig {
	@Bean
	public Date date() {
		return new Date();
	}
}

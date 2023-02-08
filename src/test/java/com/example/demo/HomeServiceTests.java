package com.example.demo;

import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.home.HomeService;

import org.springframework.util.Assert;

import java.util.Date;

@Log4j
@SpringBootTest
class HomeServiceTests {
	@Autowired
	private HomeService homeService;

	@Test
	void testDate() {
		Date date = homeService.getDate();
		log.info(date);
		Assert.notNull(date, "Date should not be null");
	}
}

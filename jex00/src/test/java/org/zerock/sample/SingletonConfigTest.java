package org.zerock.sample;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.SingletonConfig;

import lombok.extern.log4j.Log4j;

@Log4j
@ContextConfiguration(classes= {SingletonConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class SingletonConfigTest {
	@Autowired
	private Date date; // ID가 date인 빈
	
	@Autowired
	private Date date2; // ID가 date2인 빈
	
	@Autowired
	@Qualifier("date") // ID가 date인 빈
	private Date date3;
	
	@Autowired
	private Singleton singleton; // 타입이 Singleton인 빈
	
	@Test
	public void testDate() {
		assert !date.equals(date2);
		assert date.equals(date3);
		log.info(date.getTime());
		log.info(date2.getTime());
		log.info(date3.getTime());
	}

	@Test
	public void testSingleton() {
		assert singleton.getDate().equals(date);
		log.info(singleton); // Singleton(date=...)
	}
}

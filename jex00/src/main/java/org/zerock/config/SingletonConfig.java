package org.zerock.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "org.zerock.sample" })
public class SingletonConfig {
//private static Date date;
	
	@Bean
	public Date date() { // 타입이 Date이고 ID가 date인 빈 등록
//	자동으로 싱글톤 처리
//	if (date == null) {
//		date = new Date();
//	}
//	return date;
		return new Date(); // 현재 시간으로 딱 한 번 생성
	}

	@Bean
	public Date date2() { // 타입이 Date이고 ID가 date2인 빈 등록
		return new Date();
	}

// 사용자 정의 클래스는 컴포넌트로 등록 가능
//@Bean
//public Singleton singleton() { // 타입이 Date이고 ID가 date2인 빈 등록
//	return new Singleton(date());
//}
}

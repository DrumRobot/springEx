package org.zerock.sample;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Component
public class Singleton {
//@Autowired
	private Date date;
	
//	public Singleton(Date date) {
//		this.date = date;
//	}

//	public Date getDate() {
//		return date;
//	}
	
//	public void setDate(Date date) {
//		this.date = date;
//	}
}

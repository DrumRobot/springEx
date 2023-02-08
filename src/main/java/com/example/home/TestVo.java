package com.example.home;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Component
@AllArgsConstructor
public class TestVo {
	private Date date;
}

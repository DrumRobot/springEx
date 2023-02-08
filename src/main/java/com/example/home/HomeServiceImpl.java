package com.example.home;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("homeService")
public class HomeServiceImpl implements HomeService {
	@Autowired
	public TestVo testVo;

	@Override
	public Date getDate() {
		return testVo.getDate();
	}
}

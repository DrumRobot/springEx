package com.example.home;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("homeService")
public class HomeServiceImpl implements HomeService {
    @Autowired
    public Date date;

    @Override
    public Date getDate() {
        return date;
    }
}

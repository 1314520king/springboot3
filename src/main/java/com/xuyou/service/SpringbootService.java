package com.xuyou.service;

import com.xuyou.dao.SpingbootDao;
import com.xuyou.entity.NewsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springboot
 * @description:
 * @author: Mr.xu
 * @create: 2021-08-12 14:21
 **/
@Service
public class SpringbootService {
    @Autowired
    private SpingbootDao dao;
    public List<NewsUser> getUser(){
        return dao.getUser();
    }
}

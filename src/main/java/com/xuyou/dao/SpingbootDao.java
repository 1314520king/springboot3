package com.xuyou.dao;

import com.xuyou.entity.NewsUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: springboot
 * @description:
 * @author: Mr.xu
 * @create: 2021-08-12 14:19
 **/
@Mapper
public interface SpingbootDao {
    public List<NewsUser> getUser();
}

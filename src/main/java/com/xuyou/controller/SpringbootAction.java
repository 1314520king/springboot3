package com.xuyou.controller;
import com.xuyou.entity.NewsUser;
import com.xuyou.service.SpringbootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @program: springboot
 * @description:
 * @author: Mr.xu
 * @create: 2021-08-12 14:24
 **/
@RestController //相当于@ResponseBody和Controller
public class SpringbootAction {
    @Autowired
    public SpringbootService service;
    @GetMapping("/getUser")
    public List<NewsUser> getUser(){
        System.out.println("saasdfafasasfdas");
        return service.getUser();
    }
}

package com.xuyou.controller;

import com.xuyou.entity.NewsUser;
import jdk.nashorn.internal.runtime.linker.LinkerCallSite;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springboot
 * @description:
 * @author: Mr.xu
 * @create: 2021-09-02 09:20
 **/
@RestController
public class ShoppingAction {
    private List<NewsUser> userList = new ArrayList<>();

    {
        userList.add(new NewsUser(1, "武大郎", "123456"));
        userList.add(new NewsUser(2, "西门庆", "123456"));
        userList.add(new NewsUser(3, "潘金莲", "123456"));
    }

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("user/user", "userList", userList);
    }

    @GetMapping("/shopping")
    public ModelAndView index1() {
        return new ModelAndView("shopping", "userList", userList);
    }
}

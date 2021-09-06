package com.xuyou.entity;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: springboot
 * @description:
 * @author: Mr.xu
 * @create: 2021-09-02 11:29
 **/
//需要加@Component 注解
@Component
@Endpoint(id="programmer")
public class MyEndPoint {
    @ReadOperation
    public Programmer read(){
        return  new Programmer("孙悟空",10000,100000,new Date());
    }
}

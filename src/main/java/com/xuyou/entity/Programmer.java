package com.xuyou.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: springboot
 * @description:
 * @author: Mr.xu
 * @create: 2021-09-02 11:26
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Programmer implements Serializable {
    private static final long serialVersionUID = -8940531631788243698L;
    private String name;
    private int age;
    private float salary;
    private Date birthday;

}

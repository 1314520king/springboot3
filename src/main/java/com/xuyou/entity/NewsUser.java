package com.xuyou.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: springboot
 * @description:
 * @author: Mr.xu
 * @create: 2021-08-12 14:17
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewsUser {
    private int id;
    private String name;
    private String password;
}

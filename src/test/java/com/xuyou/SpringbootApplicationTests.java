package com.xuyou;

import com.xuyou.springboot.entity.GreatPotatoesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {
    @Autowired
     private GreatPotatoesService service;
    @Test
    void contextLoads() {
        System.out.println(service.say());
    }

}

package com.xuyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//1.boot项目的启动点
//2.自动打包，默认打包规则，从这个启动程序开始的包作为依赖开始扫描（包括子包）
//3.完成自动配置
//4.读取配置文件
@ServletComponentScan
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}

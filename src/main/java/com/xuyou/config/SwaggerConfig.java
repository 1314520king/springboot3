package com.xuyou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: springboot
 * @description:
 * @author: Mr.xu
 * @create: 2021-09-02 14:16
 **/
@Configuration
@EnableSwagger2 // 开启swagger必须加
public class SwaggerConfig {
    @Bean
    public Docket docket(){
        //扫描包路径，加了swagger注解的类包
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xuyou.controller"))
                .paths(PathSelectors.any()).build();
    }
    //构建api文档的详细信息函数
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("vue前端测试图书管理的接口说明")//页面标题
                .contact(new Contact("xy","","123456@QQ.com"))//创建人
                .version("1.0")//版本号
                .description("API 描述")//描述
                .build();
    }
}

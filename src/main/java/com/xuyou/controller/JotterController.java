package com.xuyou.controller;

import com.xuyou.entity.Jotter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot
 * @description:
 * @author: Mr.xu
 * @create: 2021-09-02 14:36
 **/
@RestController
@CrossOrigin
@Api(tags = "读书笔记基本操作")
public class JotterController {
    @ApiOperation(value = "增加或者修改读书笔记",notes = "id等于0的时候表示新增，大于0的时候表示修改")//方法操作描述
    @ApiImplicitParam(name = "jotter",value = "读书笔记的详细信息,josn格式"
            ,paramType = "body",required = true,dataType = "jotter")//参数描述
    @PostMapping("/api/addOrUpdateJotter")
    public boolean addOrUpdateJotter(@RequestBody Jotter jotter){
        return true;
    }
}

package com.xuyou.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * @program: springboot
 * @description:
 * @author: Mr.xu
 * @create: 2021-09-02 14:29
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "jotter",description = "读书笔记jotter")
public class Jotter {
    @ApiModelProperty(value="读书笔记id",name="id",example = "1")
    private int id;
    @ApiModelProperty(value="读者id",name="userId",example = "1")
    private int userId;
    @ApiModelProperty(value="读者姓名",name="username",example = "伟大的帅哥")
    private String username;
    @ApiModelProperty(value="读者笔记日期",name="date",example = "2019-10-01 09:09:01")
    private String date;
    @ApiModelProperty(value="读者心得",name="content",example = "学了就成就java超神")
    private String content;
}

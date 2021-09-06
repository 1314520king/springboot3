package com.xuyou.servlet;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @program: springboot
 * @description: 定时任务
 * @author: Mr.xu
 * @create: 2021-09-02 08:46
 **/
//@Service
//@EnableScheduling// 一定要加，开启定时任务
//public class SchedulingService {
//    @Scheduled(fixedDelay = 5000)//5秒执行一次，定时任务
//    public void job(){
//        System.out.println("任务开始执行");
//    }
//    @Scheduled(cron = "0 0 0 * * ?")//每天凌晨开始执行任务
//    public void job1(){
//        System.out.println("在具体时间开始执行");
//    }
//}

package com.xuyou.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

/**
 * @program: springboot
 * @description:
 * @author: Mr.xu
 * @create: 2021-09-02 11:39
 **/

public class MyHealthIndicator implements HealthIndicator {
    private static final String VERSION="v1.0.0";
    @Override
    public Health health() {
        int code=0;
        if (code!=0){
            Health.down().withDetail("code",code).withDetail("version",VERSION).build();
        }
        return Health.up().withDetail("code",code).withDetail("version",VERSION).up().build();
    }
}

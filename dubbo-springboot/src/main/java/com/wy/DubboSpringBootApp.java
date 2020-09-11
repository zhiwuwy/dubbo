package com.wy;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangyang
 * @date 2020/9/4 0:59
 * @description:
 */
@SpringBootApplication
@DubboComponentScan("com.wy")
public class DubboSpringBootApp {
    public static void main(String[] args) {
        SpringApplication.run(DubboSpringBootApp.class,args);
    }
}

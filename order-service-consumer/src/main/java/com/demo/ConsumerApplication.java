package com.demo;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 **/

//一定要配置这个，否则注册不到zk上 ，也可以陪在yml:
//dubbo.scan.base-packages=com.jay.demo.service //这个包是interface下的service都是dubbo类型的service
@DubboComponentScan(basePackages = "com.jay.demo.service")
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);

    }

}

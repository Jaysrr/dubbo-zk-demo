package com.jay.demo;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//一定要配置这个，否则注册不到zk上 ，也可以陪在yml:
//dubbo.scan.base-packages=com.jay.demo.service //这个包下的service都是dubbo的service
@DubboComponentScan(basePackages = "com.jay.demo.service")
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}

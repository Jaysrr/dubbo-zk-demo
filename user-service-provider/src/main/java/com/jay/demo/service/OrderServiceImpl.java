//package com.jay.demo.service;
//
//import com.jay.demo.pojo.UserAddress;
//import org.apache.commons.lang3.builder.ToStringBuilder;
//import org.apache.dubbo.config.annotation.Reference;
//import org.apache.dubbo.config.annotation.Service;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.Arrays;
//import java.util.List;
//
///**
// * @program: dubbo-zk-demo
// * @description: 1.将服务provider注册到zk
// * 1）导入dubbo依赖 （2.7.1）
// * 2）
// * 2.让consumer去zk订阅provider的服务地址
// * @author: Jaysrr
// **/
//@Service(version = "1.0.0")
//public class OrderServiceImpl implements OrderService {
//
//    @Autowired
//    UserService userService;
//
//    @Override
//    public void initOrder(Integer[] userId) {
//        List<UserAddress> addressList = userService.getUserAddressList(userId);
//        System.out.println(ToStringBuilder.reflectionToString(addressList));
//    }
//
//
//}

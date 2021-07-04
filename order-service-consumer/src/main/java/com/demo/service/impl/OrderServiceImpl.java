package com.demo.service.impl;

import com.jay.demo.pojo.UserAddress;
import com.jay.demo.service.OrderService;
import com.jay.demo.service.UserService;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: dubbo-zk-demo
 * @description: 这里以逻辑上的消费者，写这个consumer,
 * 实际上service应该不写在consumer里
 * @description: 1.将服务provider注册到zk
 * 1）导入dubbo依赖 （2.7.1）
 * 2）
 * 2.让consumer去zk订阅provider的服务地址
 **/
@Service //注意这里的是spring的，因为在consumer下
public class OrderServiceImpl implements OrderService {

    @Reference(version = "1.0.0")
    UserService userService;

    public void initOrder(Integer[] userId) {
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        System.out.println(ToStringBuilder.reflectionToString(addressList));
    }


}




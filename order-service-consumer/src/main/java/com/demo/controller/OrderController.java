package com.demo.controller;

import com.jay.demo.pojo.UserAddress;
import com.jay.demo.service.OrderService;
import com.jay.demo.service.UserService;
import com.jay.demo.utils.JsonResult;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: dubbo-zk-demo
 * @description:
 * @author: Jaysrr
 * @create: 2021-07-02 01:01
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    @Reference(version = "1.0.0")
    UserService userService;

    @Reference(version = "1.0.0")
    OrderService orderService;

    @PostMapping("/address/list")
    public JsonResult getUserAddressList(@RequestBody Integer[] userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList.size() != 0 ?
                JsonResult.ok(userAddressList) : JsonResult.error();
    }

    @PostMapping("/init")
    public JsonResult initOrder(@RequestBody Integer[] userId) {
        orderService.initOrder(userId);
        return JsonResult.ok();
    }


}

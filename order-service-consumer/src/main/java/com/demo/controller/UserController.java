package com.demo.controller;

import com.jay.demo.service.UserService;
import com.jay.demo.utils.JsonResult;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: dubbo-zk-demo
 * @description:
 * @author: Jaysrr
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/find/{id}")
    public JsonResult findUserAddressById(@PathVariable Integer id) {
        return JsonResult.ok(userService.findUserAddressById(id));
    }


}

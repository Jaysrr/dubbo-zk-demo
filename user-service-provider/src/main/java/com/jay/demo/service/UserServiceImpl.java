package com.jay.demo.service;

import com.jay.demo.pojo.UserAddress;
import org.apache.dubbo.config.annotation.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @program: dubbo-zk-demo
 * @description: 1.将服务provider注册到zk
 * 1）导入dubbo依赖 （2.7.1）
 * 2）
 * 2.让consumer去zk订阅provider的服务地址
 * @author: Jaysrr
 * @create: 2021-06-30 23:39
 **/
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(Integer[] userId) {
        UserAddress userAddress = new UserAddress(1, "上海", "1", "wnm", "13766152014");
        UserAddress userAddress2 = new UserAddress(2, "beijing", "2", "woaini", "13766152014");

        return Arrays.asList(userAddress, userAddress2);
    }

    @Override
    public Object findUserAddressById(Integer id) {
        if (id != null) {
            return new UserAddress(id, "上海", "1", "wo", "13761522211");
        }

        return null;
    }


}

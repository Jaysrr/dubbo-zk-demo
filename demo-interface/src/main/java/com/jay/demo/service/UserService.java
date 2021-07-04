package com.jay.demo.service;

import com.jay.demo.pojo.UserAddress;

import java.util.List;

public interface UserService {
    public List<UserAddress> getUserAddressList(Integer[] userId);

    Object findUserAddressById(Integer id);
}

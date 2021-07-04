package com.jay.demo.pojo;

import lombok.Data;
import java.io.Serializable;

/**
 * @program: dubbo-zk-demo
 * @description: 用户地址
 * @author: Jaysrr
 * @create: 2021-06-30 23:37
 **/
@Data
public class UserAddress implements Serializable {
    private Integer id;
    private String userAddress;
    private String userId;
    private String receiveMan;
    private String phoneNum;

    public UserAddress(Integer id, String userAddress, String userId, String receiveMan, String phoneNum) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.receiveMan = receiveMan;
        this.phoneNum = phoneNum;
    }
}

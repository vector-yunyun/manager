package com.bjsxt.service;

import com.bjsxt.pojo.Users;

import java.util.List;

/**
 * @Auther: Vector
 * @Date: 2019/12/15
 * @Description: com.bjsxt.service
 * @version: 1.0
 */
public interface UsersService {
    void addUsers(Users users);

    List<Users> showAll();
}

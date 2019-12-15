package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Vector
 * @Date: 2019/12/15
 * @Description: com.bjsxt.service.impl
 * @version: 1.0
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUsers(Users users) {
        this.usersMapper.insertUser(users);
    }

    @Override
    public List<Users> showAll() {
        return this.usersMapper.selectUserAll();
    }
}

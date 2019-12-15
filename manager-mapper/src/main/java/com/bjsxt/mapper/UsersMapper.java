package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;

import java.util.List;

/**
 * @Auther: Vector
 * @Date: 2019/12/15
 * @Description: com.bjsxt.mapper
 * @version: 1.0
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}

package com.bjsxt.web.controller;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Vector
 * @Date: 2019/12/15
 * @Description: com.bjsxt.web.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUsers(Users users) {
        this.usersService.addUsers(users);
        return "ok";
    }
}

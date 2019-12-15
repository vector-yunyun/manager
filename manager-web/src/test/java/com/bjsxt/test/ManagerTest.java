package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: Vector
 * @Date: 2019/12/15
 * @Description: com.bjsxt.test
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUsersTest(){
        Users user=new Users();
        user.setUsername("楚楚");
        user.setUserage(29);

        this.usersMapper.insertUser(user);

    }
}

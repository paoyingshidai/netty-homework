package com.michael.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chat.commons.dao.UserMapper;
import com.chat.commons.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getUser() {

        User user = userMapper.getById(1);
        System.out.println(user.getUserName());
    }


}

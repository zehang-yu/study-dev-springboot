package com.scut.demo.dao;

import com.scut.demo.dao.UserDao;
import com.scut.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * 
 * @author xiaoliang
 * @date 2022/05/31 09:36
 **/
@SpringBootTest
public class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Test
    public void testLogin(){
        System.out.println(userDao);
        User user = new User();
        user.setName("tom");
        user.setPassword("123456");
        User userDb = userDao.handleLogin(user);
        System.out.println(userDb);
    }

    @Test
    public void testQueryByName(){
        int res = userDao.queryByName("tom");
        System.out.println(res);
    }

    @Test
    public void testSaveUser(){
        User user = new User();
        user.setName("xiaoming");
        user.setPassword("123456");
        Date date = new Date();
        user.setLastLoginTime(date);
        user.setCreateTime(date);
        int res = userDao.save(user);
        System.out.println(res);
    }

    @Test
    public void testUpdateUser(){
        User user = new User();
        user.setId(3);
        Date date = new Date();
        user.setLastLoginTime(date);
        int res = userDao.update(user);
        System.out.println(res);
    }
}

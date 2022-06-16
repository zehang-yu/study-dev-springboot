package com.scut.demo.service.impl;

import com.scut.demo.entity.User;
import com.scut.demo.dao.UserDao;
import com.scut.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User handleLogin(User user) {
        Date date = new Date();
        User u = userDao.handleLogin(user);
        if(u == null) return null;

        u.setLastLoginTime(date);
        userDao.update(u);
        return u;
    }

    @Override
    public int handleRegister(User user) {
        int count = userDao.queryByName(user.getName());
        if(count != 0) return 0;

        Date date = new Date();
        user.setCreateTime(date);
        user.setLastLoginTime(date);

        return userDao.save(user);
    }
}

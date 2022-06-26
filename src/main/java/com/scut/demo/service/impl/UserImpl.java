package com.scut.demo.service.impl;

import com.scut.demo.entity.User;
import com.scut.demo.mapper.UserMapper;
import com.scut.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User login(User user, String type) {
        if(type.equals("student")){
            return userMapper.studentLogin(user);
        }
        else if(type.equals("teacher")){
            return userMapper.teacherLogin(user);
        }
        else{
            System.out.println("用户类型传入错误");
            return null;
        }
    }
}

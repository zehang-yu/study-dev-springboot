package com.scut.demo.service;

import com.scut.demo.entity.User;

public interface UserService {
    //登录,返回
    User login(User user, String type);
}

package com.scut.demo.service;

import com.scut.demo.entity.User;

public interface UserService {

    /*
     * 验证用户登录信息
     * */
    User handleLogin(User user);

    /*
     * 验证用户注册信息
     * */
    int handleRegister(User user);
}

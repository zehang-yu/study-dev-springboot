package com.scut.demo.dao;

import com.scut.demo.entity.User;

public interface UserDao {

    /**
     * 用户登录验证
     * @param user
     * @return
     */
    User handleLogin(User user);

    /**
     * 用户名查询
     * @param name
     * @return
     */
    int queryByName(String name);

    /**
     * 添加新用户
     * @param user
     * @return
     */
    int save(User user);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    int update(User user);

}

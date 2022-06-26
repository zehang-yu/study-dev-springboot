package com.scut.demo.mapper;

import com.scut.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//学生和老师的Mapper
@Mapper
@Repository
public interface UserMapper {
    //学生登录
    User studentLogin(User user);

    //老师登录
    User teacherLogin(User user);
}

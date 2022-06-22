package com.scut.demo.service;

import com.scut.demo.entity.TestBase;

import java.util.List;

public interface TestBaseService {

    //往问题父表添加记录
    void insertTestBase(TestBase testBase);

    //获取题父表里的所有内容
    List<TestBase> getAllTestBase();

    //获取所有题id的最大值
    Integer getMaxTestID();

    //根据id删除题目
    void deleteTestBaseById(int id);
}

package com.scut.demo.service;

import com.scut.demo.entity.TestBase;

import java.util.List;

public interface TestBaseService {

    //往问题父表添加记录, isJudge: 是否为选择题
    void insertTestBase(TestBase testBase);

    //获取题父表里的所有内容
    List<TestBase> getAllTestBase();

    //获取所有题id的最大值
    Integer getMaxTestID();
}

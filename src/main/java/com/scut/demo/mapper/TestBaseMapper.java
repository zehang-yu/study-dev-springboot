package com.scut.demo.mapper;

import com.scut.demo.entity.TestBase;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestBaseMapper {
    //往问题父表添加记录
    void insertTestBase(TestBase testBase);

    //获取题父表里的所有内容
    List<TestBase> getAllTestBase();

    //获取所有题id的最大值
    int getMaxTestID();
}

package com.scut.demo.mapper;

import com.scut.demo.entity.TestInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestInfoMapper {
    //获取问题文本
    TestInfo getQuestionTextById(int id);
    //获取选项文本
    String getOptionTextById(int id);
    //获取正确答案
    String getCorrectOptionAById(int id);
}

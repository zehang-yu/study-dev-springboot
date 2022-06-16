package com.scut.demo.mapper;

import com.scut.demo.entity.TestInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestInfoMapper {
    //增加选择题
    void insertChoiceQuestion(TestInfo testInfo);

    //获取问题文本
    @Results(value = {
            @Result(column = "test_name", property = "name")
    })
    TestInfo getQuestionTextById(int id);
    //获取选项文本
    String getOptionTextById(int id);
    //获取正确答案
    String getCorrectOptionAById(int id);
}

package com.scut.demo.service;

import com.scut.demo.entity.TestInfo;
import com.scut.demo.mapper.TestInfoMapper;

public interface TestInfoService {
    //增加选择题
    void insertChoiceQuestion(TestInfo testInfo);

    //获取问题文本
    TestInfo getQuestionTextById(int id);
    //获取选项文本
    String getOptionTextById(int id);
    //获取正确答案
    String getCorrectOptionAById(int id);
}

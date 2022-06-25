package com.scut.demo.service;

import com.scut.demo.entity.StudentAnswer;
import com.scut.demo.entity.TestInfo;
import com.scut.demo.mapper.TestInfoMapper;

import java.util.List;

public interface TestInfoService {
    //增加选择题
    boolean insertChoiceQuestion(TestInfo testInfo);

    //获取问题文本
    List<TestInfo> getQuestionText();

    //记录学生做题
    boolean studentAnswer(StudentAnswer studentAnswer);

    void deleteChoiceQuestionById(int id);


}

package com.scut.demo.service;

import com.scut.demo.entity.JudgeTest;

import java.util.List;

public interface JudgeTestService {
    //增加判断题
    boolean insertJudgeQuestion(JudgeTest judgeTest);

    //获取全部问题
    List<JudgeTest> getJudgeText();
    //根据id获取判断题
    JudgeTest getJudgeTestById(int id);

    //根据id删除判断题
    void deleteJudgeTestById(int id);
}

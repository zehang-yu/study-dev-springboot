package com.scut.demo.service;

import com.scut.demo.entity.JudgeTest;
import com.scut.demo.entity.StudentAnswer;

import java.util.List;

public interface JudgeTestService {
    //增加判断题
    boolean insertJudgeQuestion(JudgeTest judgeTest);

    //获取全部问题
    List<JudgeTest> getJudgeText();
    //根据id获取判断题
    JudgeTest getJudgeTestById(int id);

    //记录学生做题情况
    boolean studentAnswerJudge(StudentAnswer studentAnswer);

    //根据id删除判断题
    void deleteJudgeTestById(int id);
}

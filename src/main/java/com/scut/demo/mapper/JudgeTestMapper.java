package com.scut.demo.mapper;

import com.scut.demo.entity.JudgeTest;
import com.scut.demo.entity.StudentAnswer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface JudgeTestMapper {
    //增加判断题
    boolean insertJudgeQuestion(JudgeTest judgeTest);

    //根据id获取判断题
    JudgeTest getJudgeTestById(int id);

    //根据id删除判断题
    void deleteJudgeTestById(int id);

    //记录学生做题情况
    boolean studentAnswerJudge(StudentAnswer studentAnswer);

    List<JudgeTest> getJudgeText();
}

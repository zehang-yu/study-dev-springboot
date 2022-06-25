package com.scut.demo.mapper;

import com.scut.demo.entity.JudgeTest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface JudgeTestMapper {
    //增加判断题
    boolean insertJudgeQuestion(JudgeTest judgeTest);

    //根据id获取判断题
    JudgeTest getJudgeTestById(int id);

    //根据id删除判断题
    void deleteJudgeTestById(int id);
}

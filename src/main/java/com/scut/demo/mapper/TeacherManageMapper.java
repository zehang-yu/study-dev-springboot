package com.scut.demo.mapper;

import com.scut.demo.entity.JudgeTest;
import com.scut.demo.entity.TeacherManage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TeacherManageMapper {
    //增加判断题
    boolean insertJudgeQuestion(JudgeTest judgeTest);

    //根据id获取判断题
    JudgeTest getJudgeTestById(int id);


    //跟据id获取错题
    TeacherManage getTeacherManageById(int ID);

    //
    boolean insertTeacherManage(TeacherManage teacherManage);
}
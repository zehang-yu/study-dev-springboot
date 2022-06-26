package com.scut.demo.service;

import com.scut.demo.entity.TeacherManage;

import java.util.List;

public interface TeacherManageService {
    //根据id获取判断题
    TeacherManage getJudgeTestById(int ID);

    //选择错题助教
    static TeacherManage getTeacherManageById(int ID) {
        return null;
    }

    List<TeacherManage> getCuoTiByStuID(Integer stu_id);
}

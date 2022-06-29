package com.scut.demo.entity;

import java.util.List;

public class TeacherManage {
    int Stu_id;

    int Q_id;

    String Stu_name;
    String Q_title;
    List<String> ZhuJiao_name;

    public TeacherManage() {
    }

    public TeacherManage(int stu_id, int q_id, String stu_name, String q_title, List<String> zhuJiao_name) {
        Stu_id = stu_id;
        Q_id = q_id;
        Stu_name = stu_name;
        Q_title = q_title;
        ZhuJiao_name = zhuJiao_name;
    }

    public int getStu_id() {
        return Stu_id;
    }

    public void setStu_id(int stu_id) {
        Stu_id = stu_id;
    }

    public int getQ_id() {
        return Q_id;
    }

    public void setQ_id(int q_id) {
        Q_id = q_id;
    }

    public String getStu_name() {
        return Stu_name;
    }

    public void setStu_name(String stu_name) {
        Stu_name = stu_name;
    }

    public String getQ_title() {
        return Q_title;
    }

    public void setQ_title(String q_title) {
        Q_title = q_title;
    }

    public List<String> getZhuJiao_name() {
        return ZhuJiao_name;
    }

    public void setZhuJiao_name(List<String> zhuJiao_name) {
        ZhuJiao_name = zhuJiao_name;
    }
}

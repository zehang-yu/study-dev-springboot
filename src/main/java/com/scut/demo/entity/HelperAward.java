package com.scut.demo.entity;


public class HelperAward {

    public HelperAward(int kp_id, int que_id, int success_time, int fail_time, int stu_id) {
        this.kp_id = kp_id;
        this.que_id = que_id;
        this.success_time = success_time;
        this.fail_time = fail_time;
        this.stu_id=stu_id;
    }
//
//    public HelperAward(int stu_id, int kp_id, int que_id, int success_time, int fail_time, int award) {
//        this.stu_id = stu_id;
//        this.kp_id = kp_id;
//        this.que_id = que_id;
//        this.success_time = success_time;
//        this.fail_time = fail_time;
//    }
//
//    public HelperAward(int stu_id, int que_id, int success_time, int fail_time) {
//        this.que_id = que_id;
//        this.success_time = success_time;
//        this.fail_time = fail_time;
//        this.stu_id = stu_id;
//    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public int getKp_id() {
        return kp_id;
    }

    public void setKp_id(int kp_id) {
        this.kp_id = kp_id;
    }

    public int getQue_id() {
        return que_id;
    }

    public void setQue_id(int que_id) {
        this.que_id = que_id;
    }

    public int getSuccess_time() {
        return success_time;
    }

    public void setSuccess_time(int success_time) {
        this.success_time = success_time;
    }

    public int getFail_time() {
        return fail_time;
    }

    public void setFail_time(int fail_time) {
        this.fail_time = fail_time;
    }

    public int isAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    int teacher_id;
    int kp_id;
    int que_id;
    int success_time;
    int fail_time;
    int award;

    int stu_id;
}

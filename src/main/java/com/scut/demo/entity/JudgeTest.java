package com.scut.demo.entity;

public class JudgeTest {
    int judgeQueid;
    String title;//题目的文本
    String ans;//正确选项

    public JudgeTest() {
    }

    public JudgeTest(int judgeQueid, String title, String ans) {
        this.judgeQueid = judgeQueid;
        this.title = title;
        this.ans = ans;
    }

    public JudgeTest(String title, String ans) {
        this.title = title;
        this.ans = ans;
    }

    public int getJudgeQueid() {
        return judgeQueid;
    }

    public void setJudgeQueid(int judgeQueid) {
        this.judgeQueid = judgeQueid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
}

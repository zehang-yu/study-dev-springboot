package com.scut.demo.entity;

public class TestBase {
    int queid;
    String title;//题目的文本
    String ans;//正确选项,用单个字母表示

    public TestBase(int queid, String title, String ans) {
        this.queid = queid;
        this.title = title;
        this.ans = ans;
    }

    public TestBase(String title, String ans) {
        this.title = title;
        this.ans = ans;
    }

    public int getQueid() {
        return queid;
    }

    public void setQueid(int queid) {
        this.queid = queid;
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

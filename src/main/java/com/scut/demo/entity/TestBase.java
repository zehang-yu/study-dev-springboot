package com.scut.demo.entity;

public class TestBase {
    int ID;
    String content;//题目的文本
    String correct;//正确选项,用单个字母表示

    public TestBase(int ID, String content, String correct) {
        this.ID = ID;
        this.content = content;
        this.correct = correct;
    }

    public TestBase(String content, String correct) {
        this.content = content;
        this.correct = correct;
    }

    public TestBase() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }
}

package com.scut.demo.entity;

public class JudgeTest {
    int ID;
    String content;//题目的文本
    String op_A;//选项文本
    String op_B;
    String correct;//正确选项 A或B

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

    public String getOp_A() {
        return op_A;
    }

    public void setOp_A(String op_A) {
        this.op_A = op_A;
    }

    public String getOp_B() {
        return op_B;
    }

    public void setOp_B(String op_B) {
        this.op_B = op_B;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }
}

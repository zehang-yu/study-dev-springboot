package com.scut.demo.entity;

import org.springframework.beans.factory.annotation.Configurable;

/* 这里表示选择题, 因为懒得改名字了......*/
public class TestInfo {
    int choiceQueid;
    String title;//题目的文本
    String opA;//选项文本
    String opB;
    String opC;
    String opD;
    String ans;//正确选项

/*    int testId;
    String name;//题目的文本
    String op_A;//选项文本
    String op_B;
    String op_C;
    String op_D;
    String correct;//正确选项*/

    public TestInfo() {
    }

    public TestInfo(int id, String testName, String op_A, String op_B, String op_C, String op_D, String correct) {
        this.choiceQueid = id;
        this.title = testName;
        this.opA = op_A;
        this.opB = op_B;
        this.opC = op_C;
        this.opD = op_D;
        this.ans = correct;
    }

    public TestInfo(String testName, String opA, String opB, String opC, String opD, String correct) {
        this.choiceQueid = choiceQueid;
        this.opA = opA;
        this.opB = opB;
        this.opC = opC;
        this.opD = opD;
        this.ans = correct;
    }

    public int getTestId() {
        return choiceQueid;
    }

    public void setTestId(int testId) {
        this.choiceQueid = testId;
    }

    public String getTestName() {
        return title;
    }

    public void setTestName(String testName) {
        this.title = testName;
    }

    public String getOpA() {
        return opA;
    }

    public void setOpA(String opA) {
        this.opA = opA;
    }

    public String getOpB() {
        return opB;
    }

    public void setOpB(String opB) {
        this.opB = opB;
    }

    public String getOpC() {
        return opC;
    }

    public void setOpC(String opC) {
        this.opC = opC;
    }

    public String getOpD() {
        return opD;
    }

    public void setOpD(String opD) {
        this.opD = opD;
    }

    public String getCorrect() {
        return ans;
    }

    public void setCorrect(String correct) {
        this.ans = correct;
    }
}

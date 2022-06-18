package com.scut.demo.entity;

import org.springframework.beans.factory.annotation.Configurable;

/* 这里表示选择题, 因为懒得改名字了......*/
public class TestInfo {
    int testId;
    String testName;//题目的文本
    String opA;//选项文本
    String opB;
    String opC;
    String opD;
    String correct;//正确选项

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
        this.testId = id;
        this.testName = testName;
        this.opA = op_A;
        this.opB = op_B;
        this.opC = op_C;
        this.opD = op_D;
        this.correct = correct;
    }

    public TestInfo(String testName, String opA, String opB, String opC, String opD, String correct) {
        this.testName = testName;
        this.opA = opA;
        this.opB = opB;
        this.opC = opC;
        this.opD = opD;
        this.correct = correct;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
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
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }
}

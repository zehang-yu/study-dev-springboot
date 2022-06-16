package com.scut.demo.entity;

public class TestInfo {
    int ID;
    String name;//题目的文本
    String op_A;//选项文本
    String op_B;
    String op_C;
    String op_D;
    String correct;//正确选项

    public TestInfo() {
    }

    public TestInfo(int ID, String name, String type, String op_A, String op_B, String op_C, String op_D, String correct) {
        this.ID = ID;
        this.name = name;
        this.op_A = op_A;
        this.op_B = op_B;
        this.op_C = op_C;
        this.op_D = op_D;
        this.correct = correct;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getOp_C() {
        return op_C;
    }

    public void setOp_C(String op_C) {
        this.op_C = op_C;
    }

    public String getOp_D() {
        return op_D;
    }

    public void setOp_D(String op_D) {
        this.op_D = op_D;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }


}

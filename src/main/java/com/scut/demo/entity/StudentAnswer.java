package com.scut.demo.entity;

public class StudentAnswer {
    int studentId;
    int questionId;
    int record;

    public StudentAnswer(int studentId, int questionId, int record) {
        this.studentId = studentId;
        this.questionId = questionId;
        this.record = record;
    }

    public StudentAnswer() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }
}

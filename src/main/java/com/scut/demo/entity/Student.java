package com.scut.demo.entity;

public class Student extends User{
    int point;
    int grade;

    public Student(int id, String name, String account, String password, int point, int grade) {
        super(id, name, account, password);
        this.point = point;
        this.grade = grade;
    }

    public Student() {
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

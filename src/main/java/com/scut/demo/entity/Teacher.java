package com.scut.demo.entity;

//老师。不是知识点助教。
public class Teacher extends User{
    public Teacher(int id, String name, String account, String password) {
        super(id, name, account, password);
    }

    public Teacher(String account, String password) {
        super(account, password);
    }

    public Teacher() {
    }
}

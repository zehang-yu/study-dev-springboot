package com.scut.demo.entity;

public class HelperAward {

    public HelperAward(int id,String name, String point_type, int success_num, int defeat_num, int award) {
        this.stu_id=id;
        this.name = name;
        this.point_type = point_type;
        this.success_num = success_num;
        this.defeat_num = defeat_num;
        this.award = award;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoint_type() {
        return point_type;
    }

    public void setPoint_type(String point_type) {
        this.point_type = point_type;
    }

    public int getSuccess_num() {
        return success_num;
    }

    public void setSuccess_num(int success_num) {
        this.success_num = success_num;
    }

    public int getDefeat_num() {
        return defeat_num;
    }

    public void setDefeat_num(int defeat_num) {
        this.defeat_num = defeat_num;
    }

    public int isAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    int stu_id;
    String name ;
    String point_type;
    int success_num;
    int defeat_num;
    int award;
}

package com.sxpi.dsj2201.yxx.practice06;
//0436210140于小翔

public class Student {
    private String sid; // 学号
    private String name; // 姓名
    private int age; // 年龄
    private boolean married; // 是否已婚

    // 获取姓名
    public String getName() {
        return name;
    }

    // 获取年龄
    public int getAge() {
        return age;
    }

    // 获取学号
    public String getSid() {
        return sid;
    }

    // 设置姓名
    public void setName(String name) {
        this.name = name;
    }

    // 设置年龄
    public void setAge(int age) {
        this.age = age;
    }

    // 设置是否已婚
    public void setMarried(boolean married) {
        this.married = married;
    }

    // 设置学号
    public void setSid(String sid) {
        this.sid = sid;
    }

    // 输出学生信息
    public void getInfo(){
        System.out.println("我是一个学生");
    }
}

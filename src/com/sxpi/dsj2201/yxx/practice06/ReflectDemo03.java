package com.sxpi.dsj2201.yxx.practice06;
//0436210140于小翔

import java.lang.reflect.Field;

// 定义一个Persion3类
class Persion3 {
    private String name; // 姓名
    public int age; // 年龄

    // 输出个人信息
    public String toString(){
        return "姓名：" + this.name + " 年龄：" + this.age + "岁";
    }
}

// ReflectDemo03类
public class ReflectDemo03 {
    public static void main(String[] args)throws Exception {
        // 加载Persion3类
        Class clazz = Class.forName("com.sxpi.dsj2201.yxx.practice06.Persion3");

        // 创建Persion3对象
        Object p = clazz.newInstance();

        // 获取name和age字段
        Field nameField = clazz.getDeclaredField("name");
        Field ageField = clazz.getDeclaredField("age");

        // 设置字段可访问
        nameField.setAccessible(true);
        ageField.setAccessible(true);

        // 设置name和age值
        nameField.set(p,"于小翔");
        ageField.set(p,20);

        // 输出结果
        System.out.println(p);
    }
}

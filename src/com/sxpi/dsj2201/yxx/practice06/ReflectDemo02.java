package com.sxpi.dsj2201.yxx.practice06;
//0436210140于小翔

import java.lang.reflect.Constructor;

// 定义一个Person2类
class Person2 {
    private String name; // 姓名
    private int age; // 年龄

    // 构造方法
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 获取姓名
    public String getName() {
        return name;
    }

    // 获取年龄
    public int getAge() {
        return age;
    }

    // 设置姓名
    public void setName(String name) {
        this.name = name;
    }

    // 设置年龄
    public void setAge(int age) {
        this.age = age;
    }

    // 输出个人信息
    @Override
    public String toString() {
        return "姓名：" + name + "年龄：" + age + "岁";
    }
}

// ReflectDemo02类
public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        // 加载Person2类
        Class clazz = Class.forName("com.sxpi.dsj2201.yxx.practice06.Person2");

        // 获取构造方法
        Constructor cons[] = clazz.getConstructors();

        // 创建Person2对象
        Person2 p = (Person2) cons[0].newInstance("于小翔", 20);

        // 输出结果
        System.out.println(p);
    }
}

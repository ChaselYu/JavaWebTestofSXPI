package com.sxpi.dsj2201.yxx.practice06;
//0436210140于小翔
import java.lang.reflect.Method;

// 定义一个Person4类
class Person4{
    private String name; // 姓名
    public int age; // 年龄

    // 获取年龄
    public int getAge() {
        return age;
    }

    // 获取姓名
    public String getName() {
        return name;
    }

    // 设置年龄
    public void setAge(int age) {
        this.age = age;
    }

    // 设置姓名
    public void setName(String name) {
        this.name = name;
    }

    // 输出个人信息
    public String sayHello(String name,int age){
        return "大家好，我是"+name+"，今年"+age+"岁了";
    }
}

// ReflectDemo04类
public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        // 加载Person4类
        Class clazz = Class.forName("com.sxpi.dsj2201.yxx.practice06.Person4");

        // 获取sayHello方法
        Method md = clazz.getMethod("sayHello",String.class,int.class);

        // 创建Person4对象
        Object obj = clazz.newInstance();

        // 设置姓名和年龄
        Method setName = clazz.getMethod("setName",String.class);
        setName.invoke(obj,"于小翔");
        Method setAge = clazz.getMethod("setAge",int.class);
        setAge.invoke(obj,20);

        // 调用sayHello方法
        String result = (String) md.invoke(obj,"于小翔",20);

        // 输出结果
        System.out.println(result);
    }
}

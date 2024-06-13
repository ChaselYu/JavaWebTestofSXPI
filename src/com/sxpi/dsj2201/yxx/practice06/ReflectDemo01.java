package com.sxpi.dsj2201.yxx.practice06;
//0436210140于小翔
class Person{
    private String name; // 姓名
    private int age; // 年龄

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
    @Override
    public String toString() {
        return "姓名："+ this.name +",年龄："+ this.age +"岁";
    }
}

// ReflectDemo01类
public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        // 加载Person类
        Class clazz = Class.forName("com.sxpi.dsj2201.yxx.practice06.Person");

        // 创建Person对象
        Person p = (Person)clazz.newInstance();

        // 设置姓名和年龄
        p.setName("于小翔");
        p.setAge(20);

        // 输出结果
        System.out.println(p);
    }
}

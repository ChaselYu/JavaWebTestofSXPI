package com.sxpi.dsj2201.yxx.practice06;
//0436210140于小翔

// 定义一个X类
class X {}

// GetClassNameDemo类
public class GetClassNameDemo {
    public static void main(String[] args) {
        // 创建X对象
        X x = new X();

        // 获取X类的名称
        String className = x.getClass().getName();

        // 输出X类的名称
        System.out.println(className);
    }
}

package com.sxpi.dsj2201.yxx.practice04.BookData;
//0436210140于小翔

import java.io.Serializable;

// 声明一个Book类，实现Serializable接口
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    // 声明id和name属性
    private String id;
    private String name;
    // 默认构造方法
    public Book(){
    }
    // 带参数的构造方法
    public Book(String id,String name){
        this.id = id;
        this.name = name;
    }

    // getter和setter方法
    public String getId() {
        return id;
    }

    public void setId(String id) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

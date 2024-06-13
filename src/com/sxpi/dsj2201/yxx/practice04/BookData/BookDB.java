package com.sxpi.dsj2201.yxx.practice04.BookData;
//0436210140于小翔
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class BookDB {
    private static Map<String, Book> books = new LinkedHashMap<String, Book>();

    static {
        // 初始化一些图书
        books.put("1", new Book("1", "JavaWeb程序开发入门"));
        books.put("2", new Book("2", "Spark编程基础"));
        books.put("3", new Book("3", "Python数据可视化与实战"));
        books.put("4", new Book("4", "hive仓库基础"));
    }
    //获得所有的图书
    public static Collection<Book> getAll() {
        return books.values();
    }
    //根据Id获得图书
    public static Book getById(String id) {
        return books.get(id);
    }
}

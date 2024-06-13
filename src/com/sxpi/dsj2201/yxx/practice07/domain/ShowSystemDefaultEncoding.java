package com.sxpi.dsj2201.yxx.practice07.domain;
//0436210140于小翔
public class ShowSystemDefaultEncoding {
public static void main(String[] args) {
    String encoding = System.getProperty("file.encoding");
    System.out.println(encoding);
    }
}
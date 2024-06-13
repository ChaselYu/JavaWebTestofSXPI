package com.sxpi.dsj2201.yxx.practice07.domain;
//0436210140于小翔
public class UserBean {
    private String name; // 用户名
    private String password; // 密码
    private String email; // 邮箱

    // 获取用户名
    public String getName() {
        return name;
    }

    // 获取邮箱
    public String getEmail() {
        return email;
    }

    // 获取密码
    public String getPassword() {
        return password;
    }

    // 设置用户名
    public void setName(String name) {
        this.name = name;
    }

    // 设置邮箱
    public void setEmail(String email) {
        this.email = email;
    }

    // 设置密码
    public void setPassword(String password) {
        this.password = password;
    }
}

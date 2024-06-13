package com.sxpi.dsj2201.yxx.practice07.domain;
//0436210140于小翔
import java.util.HashMap;
import java.util.Map;

// 定义一个RegisterFromBean类，用于存储注册表单信息
public class RegisterFromBean {
    private String username; // 用户名
    private String password; // 密码
    private String password2; // 确认密码
    private String email; // 邮箱
    private Map<String, String> errors = new HashMap<String, String>(); // 错误信息

    // 获取用户名
    public String getUsername() {
        return username;
    }

    // 获取密码
    public String getPassword() {
        return password;
    }

    // 获取邮箱
    public String getEmail() {
        return email;
    }

    // 获取确认密码
    public String getPassword2() {
        return password2;
    }

    // 设置用户名
    public void setUsername(String username) {
        this.username = username;
    }

    // 设置密码
    public void setPassword(String password) {
        this.password = password;
    }

    // 设置邮箱
    public void setEmail(String email) {
        this.email = email;
    }

    // 设置确认密码
    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    // 验证注册信息
    public boolean validate() {
        boolean flag = true;
        // 判断用户名是否为空
        if (username == null || username.trim().equals("")) {
            errors.put("username", "用户名不能为空");
            flag = false;
        }
        // 判断密码是否为空
        if (password == null || password.trim().equals("")) {
            errors.put("password", "密码不能为空");
            flag = false;
        } else if (password.length() < 6 || password.length() > 12) {
            errors.put("password", "密码长度必须在6到12之间");
            flag = false;
        }
        // 判断确认密码是否为空
        if (password2 == null || password2.trim().equals("")) {
            errors.put("password2", "确认密码不能为空");
            flag = false;
        }
        // 判断两次密码是否一致
        if (!password.equals(password2)) {
            errors.put("password2", "两次密码不一致");
            flag = false;
        }
        // 判断邮箱是否为空
        if (email == null || email.trim().equals("")) {
            errors.put("email", "请输入邮箱，邮箱不能为空");
            flag = false;
        } else if (!email.matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")) {
            errors.put("email", "邮箱格式不正确");
            flag = false;
        }
        return flag;
    }
    // 设置错误信息
    public void setErrorMsg(String err, String errMsg){
        if ((err!=null) && (errMsg!=null)){
            errors.put(err, errMsg);
        }
    }
    // 获取错误信息
    public Map<String, String> getErrors() {
        return errors;
    }
}

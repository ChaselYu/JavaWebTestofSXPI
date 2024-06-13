package com.sxpi.dsj2201.yxx.practice07.util;
//0436210140于小翔
import com.sxpi.dsj2201.yxx.practice07.domain.UserBean;

import java.util.HashMap;

// 定义一个DBUtil类，用于模拟数据库操作
public class DBUtil {
    private static DBUtil instance = new DBUtil();
    private HashMap<String, UserBean> users = new HashMap<String,UserBean>();

    // 私有化构造方法，防止外部实例化
    private DBUtil(){
        // 添加两个测试用户
        UserBean user1 = new UserBean();
        user1.setName("于小翔");
        user1.setPassword("0436210140");
        user1.setEmail("ChaselYuOfficial@gmail.com");
        users.put("0436210140", user1);


        UserBean user2 = new UserBean();
        user2.setName("张三");
        user2.setPassword("1234567890");
        user2.setEmail("zhangsan@gmail.com");
        users.put("1234567890", user2);

    }

    // 获取DBUtil实例
    public static DBUtil getInstance(){
        return instance;
    }

    // 根据用户名获取用户信息
    public UserBean getUserForName(String name){
        UserBean user = (UserBean)users.get(name);
        return user;
    }

    // 插入用户信息
    public boolean insertUser(UserBean user){
        if (user == null){
            return false;
        }
        String name = user.getName();
        if (users.get(name)!=null){
            return false;
        }
        users.put(name, user);
        return true;
    }
}

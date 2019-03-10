package com.hunau.service;

import com.hunau.entity.User;
import com.hunau.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by MI on 2019/2/7.
 * 连接UserMapping和UserController的服务层
 */
@Repository
public class UserService {
    @Autowired
    UserMapper userMapper;

    public String login(User user) {
        User user2 = userMapper.login(user.getName());
        if (user2 == null || user2.getName() == null || user2.getName().equals(""))
            return "用户名不存在";
        if (user.getPwd().equals(user2.getPwd()))
            return "success";
        return "defeat";
    }

    public int register(User user) {
        return userMapper.register(user.getName(), user.getPwd());
    }

}

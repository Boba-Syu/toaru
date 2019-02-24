package com.hunau.controller;

import com.hunau.entity.User;
import com.hunau.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MI on 2019/2/7.
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("userLogin")
    public String userLogin(@RequestParam(value = "ObjectUser") String user) {
        JSONObject j = JSONObject.fromObject(user);
        User user1 = (User) JSONObject.toBean(j, User.class);
        User user2 = userService.login(user1.getName());
        if( user1.getPwd().equals(user2.getPwd()) ) {
            return "success";
        } else {
            return "defeat";
        }
    }

    @RequestMapping("userRegister")
    public String userRegister(@RequestParam(value = "ObjectUser") String user) {
        JSONObject j = JSONObject.fromObject(user);
        User user1 = (User) JSONObject.toBean(j, User.class);
        int result = userService.register(user1);
/*        System.out.println(user);
        System.out.println(user1);*/
        if(result == 1) {
            return "success";
        } else {
            return "defeat";
        }
    }

}

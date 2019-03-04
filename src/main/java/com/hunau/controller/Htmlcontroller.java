package com.hunau.controller;


import com.hunau.entity.User;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * Created by MI on 2019/2/1.
 * HTML页面跳转
 */
@Controller
public class Htmlcontroller {

    @RequestMapping(value = "/")
    public Callable<String> index() { // 将index.html设置为主界面
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "index";
            }
        };
        return callable;
    }

    @RequestMapping(value = "login")
    public Callable<String> login() { // 跳转到登录界面login.html
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "login";
            }
        };
        return callable;
    }

    @RequestMapping(value = "register")
    public Callable<String> register() { // 跳转到注册界面register.html
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "register";
            }
        };
        return callable;
    }

    @RequestMapping("/magic")
    public Callable<String> show2(@RequestParam(value = "userName", required = false, defaultValue = "") String userName,
                                  HashMap<String, Object> map) { // 跳转到科学侧的信息展示界面magic.html
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(userName);
                map.put("userName", userName);
                return "magic";
            }
        };
        return callable;
    }

    @RequestMapping("/entty")
    public Callable<String> entty() { // 跳转到信息广播界面entty.html
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "entty";
            }
        };
        return callable;
    }
}

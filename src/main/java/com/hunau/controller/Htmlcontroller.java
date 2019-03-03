package com.hunau.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public Callable<String> show2() { // 跳转到科学侧的信息展示界面magic.html
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
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

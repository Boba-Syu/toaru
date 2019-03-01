package com.hunau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.Callable;

/**
 * Created by MI on 2019/2/1.
 */
@Controller
public class Htmlcontroller {

    @RequestMapping(value = "/")
    public Callable<String> index() {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "index";
            }
        };
        return callable;
    }

    @RequestMapping(value = "login")
    public Callable<String> login() {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "login";
            }
        };
        return callable;
    }

    @RequestMapping(value = "register")
    public Callable<String> register() {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "register";
            }
        };
        return callable;
    }

    @RequestMapping("/magic")
    public Callable<String> show2() {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "magic";
            }
        };
        return callable;
    }
}

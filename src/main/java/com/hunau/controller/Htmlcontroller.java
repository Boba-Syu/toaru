package com.hunau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MI on 2019/2/1.
 */
@Controller
public class Htmlcontroller {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "register")
    public String register() {
        return "register";
    }

    @RequestMapping("/magic")
    public String show2() {
        return "magic";
    }
}

package com.hunau.controller;

import com.hunau.entity.MagicUser;
import com.hunau.service.magicUserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by MI on 2019/2/1.
 */
@RestController
public class MagicUserContror {
    @Autowired
    private magicUserService userService;

    @RequestMapping("/select")
    public MagicUser select(@RequestParam(value = "ObjectUser") String user) {
        JSONObject j = JSONObject.fromObject(user);
        MagicUser user1 = (MagicUser) JSONObject.toBean(j, MagicUser.class);
        return userService.select(user1.getCname());
    }

    @RequestMapping("/search")
    public List<MagicUser> search(@RequestParam(value = "ObjectUser") String user) {
        JSONObject j = JSONObject.fromObject(user);
        MagicUser user1 = (MagicUser)JSONObject.toBean(j, MagicUser.class);
        return userService.search(user1.getCname());
    }

    @RequestMapping("/select2")
    public String select2(@RequestParam(value = "ObjectUser") String user) {
        JSONObject j = JSONObject.fromObject(user);
        MagicUser user1 = (MagicUser)JSONObject.toBean(j, MagicUser.class);
        MagicUser user2 = userService.select(user1.getCname());
        if(user2.getCname().equals(user1.getCname()))
            return "success";
        else
            return "defeat";
    }

    @RequestMapping("/insert")
    public String insert(@RequestParam(value = "ObjectUser") String user) {
        JSONObject j = JSONObject.fromObject(user);
        MagicUser user1 = (MagicUser)JSONObject.toBean(j, MagicUser.class);
        int result = userService.insert(user1);
        if(result==1) {
            return "success";
        }else {
            return "defeat";
        }
    }

    @RequestMapping("/update")
    public String update(@RequestParam(value = "ObjectUser") MagicUser user) {
        int result = userService.update(user);
        if(result==1) {
            return "success";
        }else {
            return "defeat";
        }
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "ObjectUser") String user) {
        JSONObject j = JSONObject.fromObject(user);
        MagicUser user1 = (MagicUser)JSONObject.toBean(j, MagicUser.class);
        int result = userService.delete(user1.getCname());
        if(result == 1) {
            return "success";
        }else {
            return "defeat";
        }
    }

    @RequestMapping("/show2")
    public List<MagicUser> show() {
        List<MagicUser> users = userService.showAll();
        return users;
    }
}

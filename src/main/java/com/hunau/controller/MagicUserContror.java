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
import java.util.concurrent.Callable;

/**
 * Created by MI on 2019/2/1.
 */
@RestController
public class MagicUserContror {
    @Autowired
    private magicUserService userService;

    @RequestMapping("/select")
    public Callable<MagicUser> select(@RequestParam(value = "ObjectUser") String user) {
        Callable<MagicUser> callable = new Callable<MagicUser>() {
            @Override
            public MagicUser call() throws Exception {
                JSONObject j = JSONObject.fromObject(user);
                MagicUser user1 = (MagicUser) JSONObject.toBean(j, MagicUser.class);
                return userService.select(user1.getCname());
            }
        };
        return callable;
    }

    @RequestMapping("/search")
    public Callable<List<MagicUser>> search(@RequestParam(value = "ObjectUser") String user) {
        Callable<List<MagicUser>> callable = new Callable<List<MagicUser>>() {
            @Override
            public List<MagicUser> call() throws Exception {
                JSONObject j = JSONObject.fromObject(user);
                MagicUser user1 = (MagicUser) JSONObject.toBean(j, MagicUser.class);
                return userService.search(user1.getCname());
            }
        };
        return callable;
    }

    @RequestMapping("/select2")
    public Callable<String> select2(@RequestParam(value = "ObjectUser") String user) {
        Callable<String> callable = new Callable<String>() {
            public String call() throws Exception {
                JSONObject j = JSONObject.fromObject(user);
                MagicUser user1 = (MagicUser) JSONObject.toBean(j, MagicUser.class);
                MagicUser user2 = userService.select(user1.getCname());
                if (user2.getCname().equals(user1.getCname()))
                    return "success";
                else
                    return "defeat";
            }
        };
        return callable;
    }

    @RequestMapping("/insert")
    public Callable<String> insert(@RequestParam(value = "ObjectUser") String user) {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                JSONObject j = JSONObject.fromObject(user);
                MagicUser user1 = (MagicUser) JSONObject.toBean(j, MagicUser.class);
                int result = userService.insert(user1);
                if (result == 1) {
                    return "success";
                } else {
                    return "defeat";
                }
            }
        };
        return callable;
    }

    @RequestMapping("/update")
    public Callable<String> update(@RequestParam(value = "ObjectUser") MagicUser user) {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                int result = userService.update(user);
                if (result == 1) {
                    return "success";
                } else {
                    return "defeat";
                }
            }
        };
        return callable;
    }

    @RequestMapping("/delete")
    public Callable<String> delete(@RequestParam(value = "ObjectUser") String user) {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                JSONObject j = JSONObject.fromObject(user);
                MagicUser user1 = (MagicUser) JSONObject.toBean(j, MagicUser.class);
                int result = userService.delete(user1.getCname());
                if (result == 1) {
                    return "success";
                } else {
                    return "defeat";
                }
            }
        };
        return callable;
    }

    @RequestMapping("/show2")
    public Callable<List<MagicUser>> show() {
        Callable<List<MagicUser>> callable = new Callable<List<MagicUser>>() {
            @Override
            public List<MagicUser> call() throws Exception {
                List<MagicUser> users = userService.showAll();
                return users;
            }
        };
        return callable;
    }
}

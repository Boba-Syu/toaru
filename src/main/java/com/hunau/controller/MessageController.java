package com.hunau.controller;

import com.hunau.entity.Message;
import com.hunau.service.MessageService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by MI on 2019/3/4.
 */
@RestController
public class MessageController {
    @Autowired
    MessageService messageService;

    @RequestMapping("/messageSelect")
    public Callable<List<Message>> select() {
        Callable<List<Message>> callable = new Callable<List<Message>>() {
            @Override
            public List<Message> call() throws Exception {
                List<Message> list = messageService.select();
                return list;
            }
        };
        return callable;
    }

    @RequestMapping("/messageInsert")
    public Callable<String> insert(@RequestParam(value = "ObjectMessage") String message) {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                JSONObject j = JSONObject.fromObject(message);
                Message message1 = (Message) JSONObject.toBean(j, Message.class);
                //System.out.println(message);
                //System.out.println(message1);
                int result = messageService.insert(message1.getName(), message1.getTime(), message1.getText());
                if (result == 1) {
                    return "success";
                } else {
                    return "defeat";
                }
            }
        };
        return callable;
    }
}

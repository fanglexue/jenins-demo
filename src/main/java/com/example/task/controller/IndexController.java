package com.example.task.controller;

import com.example.task.service.ImageIdentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanglexue on 2019/9/20.
 */
@RestController
public class IndexController {

    @Autowired
    private ImageIdentService imageIdentService;

    @RequestMapping("/async")
    public String async(){
        System.out.println("####IndexController####   1");
        imageIdentService.sendSms();
        System.out.println("####IndexController####   4");
        return "success";
    }
}

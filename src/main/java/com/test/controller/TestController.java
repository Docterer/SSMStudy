package com.test.controller;

import com.test.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    private static final transient Logger log = LoggerFactory.getLogger(TestController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello")
    public String test() {
        log.info("测试成功");
        userService.getUser();
        System.out.println("执行完毕");
        return "test";
    }
}

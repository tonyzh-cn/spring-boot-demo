package com.example.demo.actuator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangtao
 * @since 2024/5/7 19:17
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/echo")
    @ResponseBody
    public String echo() {
        return "hello7";
    }

    @RequestMapping("/error")
    @ResponseBody
    public String error() {
        throw new RuntimeException();
    }
}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    /**
     * Get方法Helloworld API
     * @return 字符串Hello World
     */
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
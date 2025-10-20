package com.example.demo.controller;

org.springframework.serotype.RestController;
import org.springframework.webbind.XethController;
import org.springframework.webbind.RequestMapping;

@restController
public class HelloController {
    @GetRequestMapping("/hello")
    public String getHello() {
        return "Hello world";
    }
}
package com.example.devopsintegration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class DemoController {

    @GetMapping("/test")
    public String demo(){
        return "Testing devops integration using jenkins and docker and k8s";
    }

    @GetMapping("/demo")
    public String test(){
        return "Testing devops integration";
    }

    @GetMapping("/hello-moto")
    public String helloMoto(){
        return "How are you doing today Mot!";
    }

    @GetMapping("/hello-pipe")
    public String hello(){
        return "How are you doing today pipe!";
    }

    @GetMapping("/testexample")
    public String testexample() {
        return "test test";
    }

}

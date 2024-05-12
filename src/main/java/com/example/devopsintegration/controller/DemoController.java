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
}

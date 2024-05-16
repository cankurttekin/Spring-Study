package com.can.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}

package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping("/")
    public String hello() {
        return "적용 됐따 양태영 바보야!!!";
    }

    @GetMapping("/test")
    public String hello2() {
        return "양태영 천재";
    }
}

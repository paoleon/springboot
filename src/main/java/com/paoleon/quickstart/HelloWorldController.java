package com.paoleon.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path="/")
    public String itWorks() {
        return "It Works!";
    }

    @GetMapping(path="/hello")
    public String helloWorld() {
        return "Hello World!";
    }
}
package com.server.map.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    // http://localhost:8080/test
    @GetMapping("/test")
    public String hello(@RequestParam(value = "name", defaultValue = "Frankie") String name) {
        return String.format("Hello %s!", name);
    }
}

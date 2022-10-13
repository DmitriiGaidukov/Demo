package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping("greeting")
    public String greeting(Map<String, Object> model) {
        model.put("message", "Hello Bryan");

        model.put("date", "12.10.2022");

        return "greeting";
    }
}

package com.example.spa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinglePageApplicationController {
    @GetMapping("/")
    public String any() {
        return "forward:/index.html";
    }
}

package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/api/v1")
public class Controller {

    @GetMapping("/index")
    public String getHomePage(){
        return "index";
    }
}

package com.ecart.E_Cart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String welcome(){
        return "Welcome to web app";
    }
    @RequestMapping("/about")
    public String welcomeabout(){
        return "Welcome to about page";
    }
}

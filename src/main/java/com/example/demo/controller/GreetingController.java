package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    Logger logger = LoggerFactory.getLogger(GreetingController.class);
    @GetMapping("/hello")
    public String getMessage(){
        logger.info("starting get message");
        return "Hi Good Afternoon!";
    }
}

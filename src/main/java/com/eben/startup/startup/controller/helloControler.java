package com.eben.startup.startup.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloControler {

    //Adding @RequstMapping
    @RequestMapping("/hello")
    public String sayHoller(){
        return "My Name is Frimpong Ebeneze\nI'm learning Java SpringBoot";
    }
}

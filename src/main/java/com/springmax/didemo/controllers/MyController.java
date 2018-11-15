package com.springmax.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String Hello(){
        System.out.println("HelloWord!!!");
        return "foo";
    }
}

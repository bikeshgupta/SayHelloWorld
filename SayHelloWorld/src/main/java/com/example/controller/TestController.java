package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class TestController {

    @RequestMapping("/")
    public String hello(){
        return "Hello World!!";
    }

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return "Hey, " + name + " !";
    }
}

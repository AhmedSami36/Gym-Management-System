package com.example.gymmanagementsystem;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/hi")
    public String hi(@RequestBody String name){
        return "Hi " + name;
    }
}

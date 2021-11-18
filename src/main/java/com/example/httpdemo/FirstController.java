package com.example.httpdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {


    @GetMapping({"greeting","/"})
    public String greeting(){
        return "Hello world from Spring boot 2.5.6";
    }
}

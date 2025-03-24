package com.yancode.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping({"/","/index"})
    public String getMapping(){
        return "Application up and running";
    }
}

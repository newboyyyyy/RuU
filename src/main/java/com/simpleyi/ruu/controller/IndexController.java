package com.simpleyi.ruu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @GetMapping("/index")
    public String goToIndex(){
        return "index";
    }
}

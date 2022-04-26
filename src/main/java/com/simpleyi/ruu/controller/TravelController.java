package com.simpleyi.ruu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TravelController {
    @GetMapping("/travel")
    public String goTravelPage(){

        return "travel";
    }
}

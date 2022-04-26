package com.simpleyi.ruu.controller;

import com.simpleyi.ruu.model.User;

import com.simpleyi.ruu.servicce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RegisterController {


    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String goToPage(Model model){
        model.addAttribute("user",new User());

        return "register";
    }


    @PostMapping("/user")
    public String createNewUser(User user){
        userService.save(user);

        return "redirect:/login";
    }
}

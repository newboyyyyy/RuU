package com.simpleyi.ruu.controller;

import com.simpleyi.ruu.model.User;
import com.simpleyi.ruu.servicce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public ModelAndView goLoginPage(){
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("user" , new User());
        return mav;
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user){
        User oauthUser = userService.login(user.getEmail(), user.getPassword());

        System.out.println(oauthUser);

        if(Objects.nonNull(oauthUser)){
            return "redirect:/index";
        }else{
            return "redirect:/login";
        }
    }




}

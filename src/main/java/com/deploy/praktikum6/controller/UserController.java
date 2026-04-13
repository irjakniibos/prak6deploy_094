package com.deploy.praktikum6.controller;


import com.deploy.praktikum6.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    List<User> dataUser = new ArrayList<>();

    @GetMapping("/")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String prosesLogin(
            @RequestParam String username,
            @RequestParam String password,
            Model model){

        if(username.equals("admin") && password.equals("123456")){
            model.addAttribute("data", dataUser);
            return "home";
        }

        model.addAttribute("error","Username atau Password salah");
        return "login";
    }

    @GetMapping("/form")
    public String form(){
        return "form";
    }

}
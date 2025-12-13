package com.example.Ecommerce.controller;

import com.example.Ecommerce.entity.User;
import com.example.Ecommerce.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserRepo userRepo;


    @GetMapping("/")
    public String getIndex(Model model){
        List<User> userList=userRepo.findAll();
        model.addAttribute("users",userList);
        model.addAttribute("user",new User());
            return "index";
    }


}

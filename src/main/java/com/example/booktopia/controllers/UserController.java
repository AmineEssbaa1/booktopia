package com.example.booktopia.controllers;

import com.example.booktopia.entities.User;
import com.example.booktopia.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/createBook")
    public String createUser(){return "CreateUser";}

    @RequestMapping("saveUser")
    public String saveUser(
            @ModelAttribute("user") User user,
            ModelMap modelMap

    ){
        User memo = userService.saveUser(user);
        String massageController = "The User whose Id :  " + memo.getIdUser() + "is saved ";
        modelMap.addAttribute("messageJsp",massageController);

        return "CreateUser";

    }
}
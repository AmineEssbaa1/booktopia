package com.example.booktopia.controllers;

import com.example.booktopia.entities.User;
import com.example.booktopia.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/createUser")
    public String createUser() {
        return "CreateUser";
    }

    @RequestMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user, ModelMap modelMap) {
        User savedUser = userService.saveUser(user);
        String message = "The user with ID: " + savedUser.getIdUser() + " has been saved.";
        modelMap.addAttribute("message", message);
        return "CreateUser";
    }

    @RequestMapping("/usersList")
    public String usersList(ModelMap modelMap) {
        List<User> users = userService.getAllUsers();
        modelMap.addAttribute("usersJsp", users);
        return "UsersList";
    }

    @RequestMapping("/showUser")
    public String showUser(@RequestParam("id") Long id, ModelMap modelMap) {
        User user = userService.getUser(id);
        modelMap.addAttribute("userJsp", user);
        return "EditUser";
    }

    @RequestMapping("/updateUser")
    public String updateUser(@ModelAttribute("user") User user, ModelMap modelMap) {
        User updatedUser = userService.saveUser(user);
        String message = "The user with ID: " + updatedUser.getIdUser() + " has been updated.";
        modelMap.addAttribute("message", message);
        return "EditUser";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") Long id, ModelMap modelMap) {
        userService.deleteUserById(id);
        List<User> users = userService.getAllUsers();
        modelMap.addAttribute("usersJsp", users);
        return "UsersList";
    }
}

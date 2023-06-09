package com.example.booktopia.controllers;

import com.example.booktopia.entities.PublishingHouse;
import com.example.booktopia.entities.User;
import com.example.booktopia.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
    public String saveUser(@Valid User user, BindingResult bindingResult
    ) {
        if (bindingResult.hasErrors()) {

            return "CreateUser";
        }
        User savedUser = userService.saveUser(user);
        return "CreateUser";
    }

//    @RequestMapping("/usersList")
//    public String usersList(ModelMap modelMap) {
//        List<User> users = userService.getAllUsers();
//        modelMap.addAttribute("usersJsp", users);
//        return "UsersList";
//    }

    @RequestMapping("/usersList")
    public String usersList(ModelMap modelMap,
                            @RequestParam(name = "page", defaultValue = "0") int page,
                            @RequestParam(name = "size", defaultValue = "5") int size
    ) {
        Page<User> usersController = userService.getAllUsersByPage(page, size);
        modelMap.addAttribute("usersJsp", usersController);
        modelMap.addAttribute("pages", new int[usersController.getTotalPages()]);
        modelMap.addAttribute("currentPage", page);
        return "UsersList";
    }


    @RequestMapping("/showUser")
    public String showUser(@RequestParam("id") Long id, ModelMap modelMap) {
        User user = userService.getUser(id);
        modelMap.addAttribute("userJsp", user);
        return "EditUser";
    }

    @RequestMapping("updateUser")
    public String updateUser(@ModelAttribute("user") User user) {
        User updatedUser = userService.saveUser(user);
        return "CreateUser";
    }

//    @RequestMapping("/deleteUser")
//    public String deleteUser(@RequestParam("id") Long id, ModelMap modelMap,
//                             @RequestParam(name = "page", defaultValue = "0") int page,
//                             @RequestParam(name = "size", defaultValue = "5") int size) {
//        userService.deleteUserById(id);
//        List<User> users = userService.getAllUsers();
//        modelMap.addAttribute("usersJsp", users);
//        return "UsersList";
//
//    }

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") Long id, ModelMap modelMap,
                             @RequestParam(name = "page", defaultValue = "0") int page,
                             @RequestParam(name = "size", defaultValue = "5") int size) {
        userService.deleteUserById(id);
        Page<User> usersController = userService.getAllUsersByPage(page, size);
        modelMap.addAttribute("usersJsp", usersController);
        modelMap.addAttribute("pages", new int[usersController.getTotalPages()]);
        modelMap.addAttribute("currentPage", page);
        return "UsersList";

    }
}

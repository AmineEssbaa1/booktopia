package com.example.booktopia.controllers;

import com.example.booktopia.entities.Author;
import com.example.booktopia.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AuthorController {
        @Autowired
        AuthorService authorService;
        @RequestMapping("/createAuthor")
        public String createAuthor(){return "CreateAuthor";}

        @RequestMapping("saveAuthor")
        public String saveAuthor(
                @ModelAttribute("author") Author author,
                ModelMap modelMap

        ){
            Author memo = authorService.saveAuthor(author);
            String massageController = "The Author whose Id :  " + memo.getIdAuthor() + "is saved ";
            modelMap.addAttribute("messageJsp",massageController);

            return "CreateAuthor";

        }
    }


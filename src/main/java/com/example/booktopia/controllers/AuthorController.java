package com.example.booktopia.controllers;

import com.example.booktopia.entities.Author;
import com.example.booktopia.services.AuthorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @RequestMapping("/createAuthor")
    public String createAuthor() {
        return "CreateAuthor";
    }

    @RequestMapping("/saveAuthor")
    public String saveAuthor(
            @Valid Author author, BindingResult bindingResult
    ) {
        if (bindingResult.hasErrors()) {

            return "CreateAuthor";
        }
        Author savedAuthor = authorService.saveAuthor(author);
        return "CreateAuthor";
    }


//    @RequestMapping("/saveAuthor")
//    public String saveAuthor(
//            @ModelAttribute("author") Author author) {
//        Author savedAuthor = authorService.saveAuthor(author);
//        return "CreateAuthor";
//    }


//    @RequestMapping("/authorsList")
//    public String authorsList(ModelMap modelMap) {
//        List<Author> authorsController = authorService.findAllAuthorsByNameSort();
//        modelMap.addAttribute("authorsJsp", authorsController);
//        return "AuthorsList";
//    }

    @RequestMapping("/authorsList")
    public String authorsList(ModelMap modelMap,
                              @RequestParam(name = "page", defaultValue = "0") int page,
                              @RequestParam(name = "size", defaultValue = "5") int size
    ) {
        Page<Author> authorsController = authorService.getAllAuthorsByPage(page, size);
        modelMap.addAttribute("authorsJsp", authorsController);
        modelMap.addAttribute("pages", new int[authorsController.getTotalPages()]);
        modelMap.addAttribute("currentPage", page);
        return "AuthorsList";
    }

    @RequestMapping("/showAuthor")
    public String showAuthor(@RequestParam("id") Long id, ModelMap modelMap) {
        Author authorController = authorService.getAuthor(id);
        modelMap.addAttribute("authorJsp", authorController);
        return "EditAuthor";
    }

    @RequestMapping("updateAuthor")
    public String updateAuthor(
            @ModelAttribute("author") Author author) {
        Author savedAuthor = authorService.saveAuthor(author);

        return "CreateAuthor";
    }

//    @RequestMapping("/deleteAuthor")
//    public String deleteAuthor(@RequestParam("id") Long id, ModelMap modelMap) {
//        authorService.deleteAuthorById(id);
//        List<Author> authorsController = authorService.getAllAuthors();
//        modelMap.addAttribute("authorsJsp", authorsController);
//        return "AuthorsList";
//    }


    @RequestMapping("/deleteAuthor")
    public String deleteAuthor(@RequestParam("id") Long id, ModelMap modelMap,
                               @RequestParam(name = "page", defaultValue = "0") int page,
                               @RequestParam(name = "size", defaultValue = "5") int size) {
        authorService.deleteAuthorById(id);
    Page<Author> authorsController = authorService.getAllAuthorsByPage(page, size);
        modelMap.addAttribute("authorsJsp",authorsController);
        modelMap.addAttribute("pages",new int[authorsController.getTotalPages()]);
        modelMap.addAttribute("currentPage",page);
        return"AuthorsList";
    }

    @GetMapping("/")
    public String home(){
        return "redirect:/authorsList";
    }


    @GetMapping("/accessDenied")
    public String accessDenied(){
        return "accessDenied";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

}

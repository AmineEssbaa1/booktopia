package com.example.booktopia.controllers;

import com.example.booktopia.entities.Book;
import com.example.booktopia.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    @Autowired
    BookService bookService;
    @RequestMapping("/createBook")
    public String createBook(){
        return "CreateBook";
    }
    @RequestMapping("saveBook")
    public String saveBook(
            @ModelAttribute("book") Book book,
            ModelMap modelMap

    ){
    Book memo = bookService.saveBook(book);
    String massageController = "The Book whose Id :  " + memo.getIdBook() + "is saved";
    modelMap.addAttribute("messageJsp",massageController);

    return "CreateBook";

    }
}

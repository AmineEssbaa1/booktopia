package com.example.booktopia.controllers;

import com.example.booktopia.entities.Book;
import com.example.booktopia.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
            @RequestParam("dateJsp") String dateController, ModelMap modelMap) throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date datePublishing = dateFormat.parse(String.valueOf(dateController));
        book.setDatePulishing(datePublishing);
        Book memo = bookService.saveBook(book);

        String messageController = "The product whose Id : "+memo.getIdBook() + "is saved";
        modelMap.addAttribute("messageJsp",messageController);
        return "CreateBook";
    }
}

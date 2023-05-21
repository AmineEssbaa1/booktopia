package com.example.booktopia.controllers;

import com.example.booktopia.entities.Book;
import com.example.booktopia.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    BookService bookService;
    @RequestMapping("/createBook")
    public String createBook(){
        return "CreateBook";
    }
    @RequestMapping("/deleteBook")
    public String deleteBook(@RequestParam("id") Long id, ModelMap modelMap) {
        bookService.deleteBookById(id);
        List<Book> booksController = bookService.getAllBooks();
        modelMap.addAttribute("booksJsp", booksController);
        return "BooksList";
    }

    @RequestMapping("/showBook")
    public String showBook(@RequestParam("id") Long id, ModelMap modelMap) {
        Book bookController = bookService.getBook(id);
        modelMap.addAttribute("booksJsp", bookController);
        return "EditBook";
    }
    @RequestMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Book book) {
         bookService.saveBook(book);
        return "CreateBook";
    }
    @RequestMapping("/updateBook")
    public String updateBook(@ModelAttribute("book") Book book) {
        bookService.saveBook(book);
        return "CreateBook";
    }
    @RequestMapping("/BooksList")
    public String booksList(ModelMap modelMap) {
        List<Book> booksController = bookService.getAllBooks();
        modelMap.addAttribute("booksJsp", booksController);
        return "BooksList";
    }
}

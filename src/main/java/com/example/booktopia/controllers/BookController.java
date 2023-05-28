package com.example.booktopia.controllers;

import com.example.booktopia.entities.Book;
import com.example.booktopia.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
    public String deleteBook(@RequestParam("id") Long id, ModelMap modelMap,
                             @RequestParam(name = "page",defaultValue = "0")  int page,
                             @RequestParam(name = "size",defaultValue = "2")int size) {
        bookService.deleteBookById(id);
        Page<Book> booksController = bookService.getAllBooksByPage(page,size);
        modelMap.addAttribute("booksJsp", booksController);
        modelMap.addAttribute("pages",new int[booksController.getTotalPages()]);
        modelMap.addAttribute("currentPage",page);
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
    public String booksList(ModelMap modelMap,
                         @RequestParam(name = "page",defaultValue = "0")  int page,
                            @RequestParam(name = "size",defaultValue = "2")int size
                            ) {
        Page<Book> booksController = bookService.getAllBooksByPage(page,size);
        modelMap.addAttribute("booksJsp", booksController);
        modelMap.addAttribute("pages",new int[booksController.getTotalPages()]);
        modelMap.addAttribute("currentPage",page);

        return "BooksList";
    }

}

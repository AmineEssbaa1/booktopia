package com.example.booktopia.controllers;

import com.example.booktopia.entities.Author;
import com.example.booktopia.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
            @ModelAttribute("author") Author author
            ) {
        Author savedAuthor = authorService.saveAuthor(author);
        return "CreateAuthor";
    }


//    @RequestMapping("/saveAuthor")
//    public String saveAuthor(
//            @ModelAttribute("author") Author author) {
//        Author savedAuthor = authorService.saveAuthor(author);
//        return "CreateAuthor";
//    }

    @RequestMapping("/authorsList")
    public String authorsList(ModelMap modelMap) {
        List<Author> authorsController = authorService.getAllAuthors();
        modelMap.addAttribute("authorsJsp", authorsController);
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
            @ModelAttribute("author") Author author,
            @RequestParam("dateBirth") String dateBirthController,
            @RequestParam("dateDeath") String dateDeathController, ModelMap modelMap) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateBirth = dateFormat.parse(String.valueOf(dateBirthController));
        author.setDateBirth(dateBirth);

        Date dateDeath=dateFormat.parse((String.valueOf(dateDeathController)));
        author.setDateDeath((dateDeath));

        Author savedAuthor = authorService.saveAuthor(author);

        return "CreateAuthor";
    }

    @RequestMapping("/deleteAuthor")
    public String deleteAuthor(@RequestParam("id") Long id, ModelMap modelMap) {
        authorService.deleteAuthorById(id);
        List<Author> authorsController = authorService.getAllAuthors();
        modelMap.addAttribute("authorsJsp", authorsController);
        return "AuthorsList";
    }
}

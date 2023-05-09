package com.example.booktopia.controllers;
import com.example.booktopia.entities.Category;
import com.example.booktopia.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService ;
    @RequestMapping("/createCategory")
    public String createCategory(){return "CreateCategory";}
    @RequestMapping("saveCategory")
    public String saveCategory(
            @ModelAttribute("category") Category category,
            ModelMap modelMap
    ){
        Category memo = categoryService.saveCategory(category);
        String messageController = "The Book whose Id :  " + memo.getIdCategory() + "is saved";
        modelMap.addAttribute("messageJsp",messageController);
        return "CreateCategory";
    }
}

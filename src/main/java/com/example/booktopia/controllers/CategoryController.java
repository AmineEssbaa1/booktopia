package com.example.booktopia.controllers;
import com.example.booktopia.entities.Category;
import com.example.booktopia.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService ;
    @RequestMapping("/createCategory")
    public String createCategory(){return "CreateCategory";}
    @RequestMapping("saveCategory")
    public String saveCategory(
            @ModelAttribute("category") Category category){

        Category memo = categoryService.saveCategory(category);

        return "CreateCategory";
    }
    @RequestMapping("/CategoriesList")
    public String categoriesList(ModelMap modelMap,
                                 @RequestParam(name = "page",defaultValue = "0")  int page,
                                 @RequestParam(name = "size",defaultValue = "2")int size
    ){
        Page<Category> categoriesController = categoryService.getAllCategoriesByPage(page,size);
        modelMap.addAttribute("categoriesJsp", categoriesController);
        modelMap.addAttribute("pages",new int[categoriesController.getTotalPages()]);
        modelMap.addAttribute("currentPage",page);

        return "CategoriesList";
    }

    @RequestMapping("/deleteCategory")
    public String deleteCategory(@RequestParam("id")Long id, ModelMap modelMap,
                                 @RequestParam(name = "page",defaultValue = "0")  int page,
                                 @RequestParam(name = "size",defaultValue = "2")int size
    ){
        categoryService.deleteCategoryById(id);
        Page<Category> categoriesController = categoryService.getAllCategoriesByPage(page,size);
        modelMap.addAttribute("categoriesJsp", categoriesController);
        modelMap.addAttribute("pages",new int[categoriesController.getTotalPages()]);
        modelMap.addAttribute("currentPage",page);

        return "CategoriesList";
    }
    @RequestMapping("/showCategory")
    public String showCategory(@RequestParam("id")Long id, ModelMap modelMap){
        Category categoryController = categoryService.getCategory(id);
        modelMap.addAttribute("categoryJsp",categoryController);
        return "EditCategory";
    }

    @RequestMapping("/updateCategory")
    public String updateCategory(@ModelAttribute("category") Category category){
         categoryService.saveCategory(category);
        return "CreateCategory";
    }
}

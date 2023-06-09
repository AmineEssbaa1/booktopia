package com.example.booktopia.services;
import com.example.booktopia.entities.Category;
import com.example.booktopia.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CategoryServiceImpl  implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository ;
    @Override
    public Category saveCategory(Category category){return categoryRepository.save(category);}

    @Override
    public Category updateCategory(Category category) {
        return category;
    }

    @Override
    public Category getCategory(Long id) {return categoryRepository.findById(id).get();}



    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);
    }


    @Override
    public void deleteAllCategories() {

    }

    @Override
    public Page<Category> getAllCategoriesByPage(int page, int size) {
        return categoryRepository.findAll(PageRequest.of(page, size));
    }


}
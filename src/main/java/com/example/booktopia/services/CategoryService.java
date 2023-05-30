package com.example.booktopia.services;
import com.example.booktopia.entities.Category;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategoryService {
    Category saveCategory(Category category);
    Category updateCategory(Category category);
    Category getCategory(Long id);

    List<Category> getAllCategories();
    void deleteCategoryById(Long id);
    void deleteAllCategories();
    Page<Category> getAllCategoriesByPage(int page, int size);


}
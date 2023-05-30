package com.example.booktopia.repositories;


import com.example.booktopia.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepository  extends JpaRepository<Category,Long>  {
}
package com.example.booktopia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategory ;

    private String description_category;

    private String label ;

    @Override
    public String toString() {
        return "Category{" +
                "idCategory=" + idCategory +
                ", description_category='" + description_category + '\'' +
                ", label='" + label + '\'' +
                '}';
    }

    public Category() {super();}

    public Category(Long idCategory, String description_category, String label) {
        this.idCategory = idCategory;
        this.description_category = description_category;
        this.label = label;
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    public String getDescription_category() {
        return description_category;
    }

    public void setDescription_category(String description_category) {
        this.description_category = description_category;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

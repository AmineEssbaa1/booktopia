package com.example.booktopia.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategory ;

    private String description_category;

    private String label ;
    @OneToMany(mappedBy = "category")
    private List<Book> books ;
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

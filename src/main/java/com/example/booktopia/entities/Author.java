package com.example.booktopia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Author {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuthor ;
    private String name;
    private String biography;

    private String  nationality;
//    private Date Date_birth;
//    private Date Date_death;


    @Override
    public String toString() {
        return "Author{" +
                "idAuthor=" + idAuthor +
                ", name='" + name + '\'' +
                ", biography='" + biography + '\'' +
                ", nationality='" + nationality + '\'' +
//                ", Date_birth=" + Date_birth +
//                ", Date_death=" + Date_death +
                '}';
    }

    public Author() {
        super();
    }

    public Author(Long idAuthor, String name, String biography, String nationality, Date date_birth, Date date_death) {
        this.idAuthor = idAuthor;
        this.name = name;
        this.biography = biography;
        this.nationality = nationality;
//        Date_birth = date_birth;
//        Date_death = date_death;
    }

    public Long getIdAuthor() {
        return idAuthor;
    }

    public String getName() {
        return name;
    }

    public String getBiography() {
        return biography;
    }

    public String getNationality() {
        return nationality;
    }

//    public Date getDate_birth() {
//        return Date_birth;
//    }
//
//    public Date getDate_death() {
//        return Date_death;
//    }

    public void setIdAuthor(Long idAuthor) {
        this.idAuthor = idAuthor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

//    public void setDate_birth(Date date_birth) {
//        Date_birth = date_birth;
//    }
//
//    public void setDate_death(Date date_death) {
//        Date_death = date_death;
//    }
}

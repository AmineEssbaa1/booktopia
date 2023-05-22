package com.example.booktopia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Author {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuthor ;
    private String name;
    private String biography;
    private String  nationality;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateBirth;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateDeath;


    @Override
    public String toString() {
        return "Author{" +
                "idAuthor=" + idAuthor +
                ", name='" + name + '\'' +
                ", biography='" + biography + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dateBirth=" + dateBirth +
                ", dateDeath=" + dateDeath +
                '}';
    }

    public Author() {
        super();
    }

    public Author(Long idAuthor, String name, String biography, String nationality, Date dateBirth, Date dateDeath) {
        this.idAuthor = idAuthor;
        this.name = name;
        this.biography = biography;
        this.nationality = nationality;
        this.dateBirth = dateBirth;
        this.dateDeath = dateDeath;
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

    public Date getDateBirth() {
        return dateBirth;
    }

    public Date getDateDeath() {
        return dateDeath;
    }

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

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setDateDeath(Date dateDeath) {
        this.dateDeath = dateDeath;
    }
}

package com.example.booktopia.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Author {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuthor ;
    @NotNull
    @Size(min = 3, max = 50)
    private String name;
    @NotNull
    @Size(min = 3, max = 50)
    private String biography;
    @NotNull
    @Size(min = 3, max = 50)
    private String  nationality;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past
    private Date dateBirth;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past
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

package com.example.booktopia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String UserName;
    private String Password ;
    private String Email;
    private String Address ;

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public User() {
        super();
    }

    public User(Long idUser, String userName, String password, String email, String address) {
        this.idUser = idUser;
        UserName = userName;
        Password = password;
        Email = email;
        Address = address;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}

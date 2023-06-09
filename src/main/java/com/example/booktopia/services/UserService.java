package com.example.booktopia.services;

import com.example.booktopia.entities.PublishingHouse;
import com.example.booktopia.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User saveUser(User user);
    User updateUser(User user);
    User getUser(Long id);
    List<User> getAllUsers();
    void deleteUserById(Long id);
    void deleteAllUsers();


    Page<User> getAllUsersByPage(int page, int size);

}

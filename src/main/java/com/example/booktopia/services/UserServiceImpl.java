package com.example.booktopia.services;

import com.example.booktopia.entities.User;
import com.example.booktopia.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public void deleteUserById(Long id) {

    }

    @Override
    public void deleteAllUsers() {

    }
}

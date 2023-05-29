package com.example.booktopia.services;

import com.example.booktopia.entities.Author;
import com.example.booktopia.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        return null;
    }

    @Override
    public Author getAuthor(Long id) {
        return null;
    }

    @Override
    public List<Author> getAllAuthor() {
        return null;
    }

    @Override
    public void deleteAuthorById(Long id) {

    }

    @Override
    public void deleteAllAuthors() {

    }
}


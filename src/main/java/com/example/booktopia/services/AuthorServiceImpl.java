package com.example.booktopia.services;

import com.example.booktopia.entities.Author;
import com.example.booktopia.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return authorRepository.save(author);
    }

    @Override
    public Author getAuthor(Long id) {
        return authorRepository.findById(id).get();
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public void deleteAuthorById(Long id) {
        authorRepository.deleteById(id);
    }

    @Override
    public void deleteAllAuthors() {
        authorRepository.deleteAll();
    }

    @Override
    public List<Author> findAllAuthorsByNameSort() {
        return authorRepository.findAllAuthorsByNameSort();
    }

    @Override
    public Page<Author> getAllAuthorsByPage(int page, int size) {
        return authorRepository.findAll(PageRequest.of(page, size));
    }
}

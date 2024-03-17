package com.example.sbjpah2.service;

import com.example.sbjpah2.model.Author;
import com.example.sbjpah2.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public List<Author> getAuthors() {
        return repository.findAll();
    }

    public Author saveAuthor(Author author) {
        return repository.save(author);
    }

    public Author updateAuthor(Integer id, Author author) {
       repository.findById(id).ifPresent(
                authorToUpdate -> {
                    authorToUpdate.setName(author.getName());
                    repository.save(authorToUpdate);
                }
        );
       return author;
    }

    public void deleteAuthor(Integer id) {
        repository.findById(id).ifPresent(
                authorToUpdate -> {
                    repository.deleteById(id);
                }
        );
    }

}

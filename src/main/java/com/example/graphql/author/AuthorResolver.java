package com.example.graphql.author;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.book.Book;

public class AuthorResolver implements GraphQLResolver<Author> {

    private AuthorRepository authorRepository;

    public AuthorResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.getOne(book.getAuthor().getId());
    }
}

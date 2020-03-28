package com.example.graphql.book;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.author.Author;
import com.example.graphql.author.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {

    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.getOne(book.getAuthor().getId());
    }
}

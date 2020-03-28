package com.example.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.author.Author;
import com.example.graphql.author.AuthorRepository;
import com.example.graphql.book.Book;
import com.example.graphql.book.BookRepository;

public class Query implements GraphQLQueryResolver {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository,
                 BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }

    public long countAuthors() {
        return authorRepository.count();
    }

}

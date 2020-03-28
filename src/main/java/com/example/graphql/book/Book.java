package com.example.graphql.book;

import com.example.graphql.author.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @GeneratedValue
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "isbn", nullable = false)
    private String isbn;
    @Column(name = "page_count", nullable = false)
    private Integer pageCount;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Author author;
}

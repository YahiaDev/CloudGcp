package com.springgcpgradle.repositories;


import com.springgcpgradle.models.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookDummyRepo {

    private List<Book> books;

    public BookDummyRepo() {
        Book book1 = Book.builder().title("Java").description("A java book").build();
        Book book2 = Book.builder().title("C++").description("A C++ book").build();
        this.books = new ArrayList<>();
        this.books.add(book1);
        this.books.add(book2);
    }

    public List<Book> add(Book book) {
        this.books.add(book);

        return this.books;
    }

    public List<Book> getAll() {
        return this.books;
    }

}

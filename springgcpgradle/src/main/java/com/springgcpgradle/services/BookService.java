package com.springgcpgradle.services;

import com.springgcpgradle.models.Book;
import com.springgcpgradle.repositories.BookDummyRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookDummyRepo bookDummyRepo;

    public BookService(BookDummyRepo bookDummyRepo) {
        this.bookDummyRepo = bookDummyRepo;
    }

    public List<Book> add(Book book) {
        return this.bookDummyRepo.add(book);
    }

    public List<Book> getAll() {
        return this.bookDummyRepo.getAll();
    }
}

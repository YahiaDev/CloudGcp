package com.springgcpgradle.controller;

import com.springgcpgradle.models.Book;
import com.springgcpgradle.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAll() {
        return new ResponseEntity(this.bookService.getAll(), HttpStatus.OK);
    }

    @PostMapping(path = "/add")
    public ResponseEntity<List<Book>> addBook(@RequestBody Book book) {
        return new ResponseEntity(this.bookService.add(book), HttpStatus.OK);
    }
}

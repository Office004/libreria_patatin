package com.patatin.libreria_da_patatin.controller;

import com.patatin.libreria_da_patatin.model.Book;
import com.patatin.libreria_da_patatin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBooks(){
        return bookService.getAllBook();
    }

    @GetMapping("/book_id")
    public Book getBookId (@PathVariable Long Id){
        return bookService.getId(Id);
    }

    @GetMapping("/duplicates")
        public boolean checkDuplicates(@RequestBody Book book){
        return bookService.hasDuplicates();
        }


}

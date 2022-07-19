package com.example.bookstoremongodb.controller;

import com.example.bookstoremongodb.model.Book;
import com.example.bookstoremongodb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        Book addBook =  bookService.saveBook(book);
        return new ResponseEntity<>(addBook, HttpStatus.CREATED);
    }

    @PostMapping("/postBooks")
    public ResponseEntity<List<Book>> saveBooks(@RequestBody List<Book> books){
        List addBooks =  bookService.saveBooks(books);
//        System.out.println(books);

        return new ResponseEntity<>(addBooks, HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List <Book>> obtainBooks(){

        List <Book> books = bookService.getBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Book>> obtainBook(@PathVariable String id){
       Optional <Book> getBook = bookService.obtainBook(id);
        System.out.println(getBook);
       return new ResponseEntity<>(getBook, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable String id){

       bookService.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

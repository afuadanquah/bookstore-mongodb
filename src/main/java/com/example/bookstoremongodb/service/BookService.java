package com.example.bookstoremongodb.service;

import com.example.bookstoremongodb.model.Book;
import com.example.bookstoremongodb.repository.BookRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getBooks() {


        return bookRepo.findAll();
    }

    public List<Book> saveBooks(List<Book> books) {

        List<Book> bookss = new ArrayList<>();



//        for (int i = 0; i < books; i++) {
//            books.add(book);
//
//            return bookRepo.saveAll(books);
//
//            books.add(book);
//            return bookRepo.saveAll(books);
//        }
        return bookRepo.saveAll(books);
    }



    public Book saveBook(Book book){

        return bookRepo.save(book);
    }

    public Optional<Book> obtainBook(String id){
        return bookRepo.findById(id);
    }

    public void delete(String id){
        bookRepo.deleteById(id);
    }
}

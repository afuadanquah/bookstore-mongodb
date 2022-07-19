package com.example.bookstoremongodb.repository;

import com.example.bookstoremongodb.model.Book;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, String> {
}

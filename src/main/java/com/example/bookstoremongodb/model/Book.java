package com.example.bookstoremongodb.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@ToString

@Document("book")
public class Book {

    @Id
    private String id;
    private String bookName;
    private String authorName;

}

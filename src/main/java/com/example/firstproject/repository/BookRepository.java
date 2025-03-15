package com.example.firstproject.repository;

import com.example.firstproject.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {
    List<Book> findByAuthor(String author);
    List<Book> findByCategory(String category);
}

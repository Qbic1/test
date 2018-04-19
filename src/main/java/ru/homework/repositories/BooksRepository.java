package ru.homework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.homework.models.Book;

import java.util.List;

public interface BooksRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByAuthor(String author);
}

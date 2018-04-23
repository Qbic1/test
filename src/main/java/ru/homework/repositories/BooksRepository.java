package ru.homework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.homework.models.Book;

import java.util.List;

public interface BooksRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByAuthor(String author);

    @Query(nativeQuery = true, value = "SELECT * FROM book WHERE id NOT IN (SELECT book_id FROM card);")
    List<Book> findFreeBooks();
}

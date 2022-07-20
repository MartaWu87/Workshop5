package pl.coderslab.service;

import pl.coderslab.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getBooks();
Optional<Book> findById(Long id);
    Book add(Book book);
    Book update(Long id, Book book);
    boolean delete(Long id);
}

package pl.coderslab.controller;

import org.springframework.stereotype.Component;
import pl.coderslab.model.Book;
import pl.coderslab.service.BookService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class MockBookService implements BookService {
    private static Long nextId = 4L;
    private List<Book> books;

    public MockBookService() {
        books = new ArrayList<>();
        books.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
        books.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        books.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
    }

    public static Long getNextId() {
        return nextId;
    }

    public static void setNextId(Long nextId) {
        MockBookService.nextId = nextId;
    }
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return books.stream().filter(it->it.getId().equals(id)).findFirst();
    }

    @Override
    public Book add(Book book) {
        return null;
    }

    @Override
    public Book update(Long id, Book book) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

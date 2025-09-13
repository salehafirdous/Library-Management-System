package com.example.library.service;

import com.example.library.dao.BookDao;
import com.example.library.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao dao;

    public List<Book> getAllBooks() {
        return dao.findAll();
    }

    public void saveBook(Book book) {
        dao.save(book);
    }

    public void deleteBook(Long id) {
        dao.deleteById(id);
    }
}

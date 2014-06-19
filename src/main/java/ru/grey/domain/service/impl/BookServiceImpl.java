package ru.grey.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.grey.domain.dao.BookDao;
import ru.grey.domain.model.Book;
import ru.grey.domain.service.BookService;

import java.util.List;

/**
 * Created by stravin on 18.06.2014.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    @Transactional
    public Book findById(Class<Book> aClass, long id) {
        return bookDao.get(id);
    }

    @Override
    @Transactional
    public List<Book> findAll() {
        return bookDao.getAll();
    }
}

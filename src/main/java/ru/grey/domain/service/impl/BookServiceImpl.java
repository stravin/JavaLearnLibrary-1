package ru.grey.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.grey.domain.dao.BookDao;
import ru.grey.domain.model.Book;
import ru.grey.domain.service.BookService;

/**
 * Created by stravin on 18.06.2014.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public Book findById(Class<Book> aClass, long id) {
        return bookDao.get(id);
    }
}

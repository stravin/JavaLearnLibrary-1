package ru.grey.domain.dao.impl;

import org.springframework.stereotype.Repository;
import ru.grey.domain.dao.BookDao;
import ru.grey.domain.model.Book;

/**
 * Created by stravin on 18.06.2014.
 */
@Repository
public class GenreDaoImpl extends BaseDaoImpl<Book> implements BookDao {

    public GenreDaoImpl(Class<Book> type) {
        super(type);
    }
}

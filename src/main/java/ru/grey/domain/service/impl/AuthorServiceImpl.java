package ru.grey.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.grey.domain.dao.AuthorDao;
import ru.grey.domain.model.Author;
import ru.grey.domain.service.AuthorService;

/**
 * Created by stravin on 18.06.2014.
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorDao authorDao;

    @Override
    @Transactional
    public Author findById(Class<Author> aClass, long id) {
        return authorDao.get(id);
    }
}

package ru.grey.domain.dao.impl;

import org.springframework.stereotype.Repository;
import ru.grey.domain.dao.GenreDao;
import ru.grey.domain.model.Genre;

/**
 * Created by stravin on 18.06.2014.
 */
@Repository
public class GenreDaoImpl extends BaseDaoImpl<Genre> implements GenreDao {

    public GenreDaoImpl() {
        super(Genre.class);
    }
}

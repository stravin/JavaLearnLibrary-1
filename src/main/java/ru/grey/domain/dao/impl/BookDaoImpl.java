package ru.grey.domain.dao.impl;

import org.springframework.stereotype.Repository;
import ru.grey.domain.dao.AuthorDao;
import ru.grey.domain.model.Author;

/**
 * Created by stravin on 18.06.2014.
 */
@Repository
public class BookDaoImpl extends BaseDaoImpl<Author> implements AuthorDao {

    public BookDaoImpl(Class<Author> type) {
        super(type);
    }

    @Override
    public Author getByFio(String value) {
        String hql = "from Author a where a.fio = :fio";
        return (Author) getSession().createQuery(hql).setParameter("fio", value);
    }
}

package ru.grey.domain.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.grey.domain.dao.BaseDao;
import ru.grey.domain.model.BaseEntity;

import java.util.List;

/**
 * Created by stravin on 17.06.2014.
 */
@Repository
public abstract class BaseDaoImpl<T extends BaseEntity> implements BaseDao<T> {

    private Class<T> type;

    public BaseDaoImpl(Class<T> type) {
        this.type = type;
    }

    @Autowired
    protected SessionFactory sessionFactory;

    @Override
    public void add(T item) {
        getSession().save(item);
    }

    @Override
    public T get(long id) {
        return (T) getSession().get(type, id);
    }

    @Override
    public List<T> getAll() {
        return getSession().createQuery("from " + this.type.getSimpleName()).list();
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}

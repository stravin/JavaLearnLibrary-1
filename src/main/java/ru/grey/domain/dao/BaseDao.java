package ru.grey.domain.dao;

import ru.grey.domain.model.BaseEntity;

import java.util.List;

/**
 * Created by stravin on 17.06.2014.
 */
public interface BaseDao<T extends BaseEntity> {
    void add(T item);
    T get(long id);
    List<T> getAll();
}

package kite.services;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

public class BaseDAO<T> {
    @Autowired
    private SessionFactory sessionFactory;

    private Class<T> entityClass;

    protected BaseDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Transactional
    public T getById(Long id) {
        return (T) sessionFactory.getCurrentSession().get(entityClass, id);
    }

    @Transactional
    public long create(T entity) {
        return (Long) sessionFactory.getCurrentSession().save(entity);
    }
}

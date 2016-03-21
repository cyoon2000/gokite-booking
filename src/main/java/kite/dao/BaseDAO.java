package kite.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class BaseDAO<T> {
    @Autowired
    protected SessionFactory sessionFactory;

    private Class<T> entityClass;

    protected BaseDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public T getById(Long id) {
        return (T) sessionFactory.getCurrentSession().get(entityClass, id);
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public List<T> getAll() {
        return (List<T>) sessionFactory.getCurrentSession()
                .createQuery("select x from " + entityClass.getSimpleName() + " x").list();
    }

    @Transactional
    public long create(T entity) {
        return (Long) sessionFactory.getCurrentSession().save(entity);
    }
}

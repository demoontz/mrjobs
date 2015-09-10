package org.demoon.mrjobs.persistence.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class GenericHibernateService<T extends Serializable>
    implements GenericService<T> {

    @Autowired
    private SessionFactory sessionFactory;
    private Class<T> tClass;

    public GenericHibernateService(Class<T> tClass) {
        this.tClass = tClass;
    }

    public void create(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
    }

    public T read(int id) {
        return tClass.cast(getSession().get(tClass, id));
    }

    public List<T> readAll() {
        Query query = getSession().createQuery("from " + tClass.getName());
        return query.list();
    }

    public void update(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
    }

    public void delete(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
    }

    protected final Session getSession() {
        return sessionFactory.openSession();
    }
}

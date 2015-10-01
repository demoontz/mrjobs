package org.demoon.mrjobs.persistence.service.generic;

import java.io.Serializable;
import java.util.List;

public interface GenericService<T extends Serializable> {

    void create(T entity);
    T read(int id);
    List<T> readAll();
    void update(T entity);
    void delete(T entity);

}

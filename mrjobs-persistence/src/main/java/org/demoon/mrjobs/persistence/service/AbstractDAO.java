package org.demoon.mrjobs.persistence.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public abstract class AbstractDAO<T> {

	@PersistenceContext(unitName = "mrjEJB")
	protected EntityManager em;
	protected Class<T> classType;

	public AbstractDAO() {
		
	}

	public AbstractDAO(Class<T> classType) {
		this.classType = classType;
	}

	public void create(T newInstance) {
		em.persist(em.merge(newInstance));
	}

	public T read(Long id) {
		T t =  em.find(classType, id);
		em.clear();
		return t;
	}

	public T update(T o) {
		return em.merge(o);
	}

	public void delete(T persistentObject) {
		em.remove(em.merge(persistentObject));
	}
	public void delete(Long id) {
		em.remove(em.find(classType, id));
	}
	public List<T> getAll() {
		String query = "SELECT t FROM " + classType.getName() + " t";
		TypedQuery<T> q = em.createQuery(query, classType);
		return q.getResultList();
	}

	@Override
	protected void finalize() throws Throwable {
		if (em != null && em.isOpen()) {
			em.close();
		}
		super.finalize();
	}

}

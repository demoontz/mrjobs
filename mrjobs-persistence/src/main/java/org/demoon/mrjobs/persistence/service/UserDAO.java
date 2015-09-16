package org.demoon.mrjobs.persistence.service;


import org.demoon.mrjobs.model.User;

import javax.persistence.TypedQuery;
import java.util.List;

public class UserDAO extends AbstractDAO<User>{
	public UserDAO() {
		super(User.class);
	}
	
	public User getUserByLoginPass(String email, String pass) {

		String query = "SELECT u FROM User u where u.email='" + email + "' and password='" + pass + "'";
		TypedQuery<User> q = em.createQuery(query, classType);
		List<User> lu = q.getResultList();

		if (lu.size() > 0)
			return lu.get(0);
		else
			return null;
	}
}

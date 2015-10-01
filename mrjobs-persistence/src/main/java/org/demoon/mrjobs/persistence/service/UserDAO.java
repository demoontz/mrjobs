package org.demoon.mrjobs.persistence.service;


import org.demoon.mrjobs.model.entity.User;
import org.demoon.mrjobs.persistence.service.generic.AbstractDAO;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
@Stateless
public class UserDAO
    extends AbstractDAO<User> {
    public UserDAO() {
        super(User.class);
    }

    public User getUserByLoginPass(String email, String pass) {

        String query = "SELECT u FROM User u where u.email='" + email + "' and password='" + pass + "'";
        TypedQuery<User> q = em.createQuery(query, classType);
        return q.getSingleResult();

    }

    public User findUserByLogin(String login) {

        String query = "SELECT u FROM User u WHERE u.email='" + login + "'";
        TypedQuery<User> q = em.createQuery(query, classType);
        return q.getSingleResult();
    }
}

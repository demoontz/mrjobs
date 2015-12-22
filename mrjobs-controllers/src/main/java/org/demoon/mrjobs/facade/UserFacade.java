package org.demoon.mrjobs.facade;

import org.demoon.mrjobs.model.entity.User;
import org.demoon.mrjobs.persistence.service.UserDAO;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by demoon on 13-Sep-15.
 */
@Stateless
public class UserFacade {
    @Inject
    UserDAO userDao;

    public User findUserByLogin(String login) {
        return userDao.findUserByLogin(login);
    }

    public void create(User user) {
        userDao.create(user);
    }

    public void update(User user) {
        userDao.update(user);
    }
}

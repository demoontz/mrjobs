package org.demoon.mrjobs.facade;

import org.demoon.mrjobs.persistence.service.UserDAO;

import javax.inject.Inject;

/**
 * Created by demoon on 13-Sep-15.
 */
public class UserFacade {
    @Inject
    UserDAO userDao;


}

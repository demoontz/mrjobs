package org.demoon.mrjobs.facade;

import org.demoon.mrjobs.persistence.service.TestGroupDAO;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by demoon on 13-Sep-15.
 */
@Stateless
public class TestFacade {

    @Inject
    private TestGroupDAO
        testDAO;

}

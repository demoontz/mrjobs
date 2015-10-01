package org.demoon.mrjobs.persistence.service;


import org.demoon.mrjobs.model.entity.TestGroup;
import org.demoon.mrjobs.persistence.service.generic.AbstractDAO;

import javax.ejb.Stateless;

@Stateless
public class TestGroupDAO
    extends AbstractDAO<TestGroup> {

    public TestGroupDAO() {
        super(TestGroup.class);
    }

}

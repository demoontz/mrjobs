package org.demoon.mrjobs.model.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by demoon on 23.09.2015.
 */
@Entity
@Table(name = "passtest")
public class PassTest    extends GenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long        id;

    @OneToOne
    private TestGroup testGroup;
    @Column
    private String result;

    public PassTest() {
    }

    public PassTest(TestGroup testGroup, String result) {
        this.result=result;
        this.testGroup=testGroup;
    }


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public TestGroup getTestGroup() {
        return testGroup;
    }

    public void setTestGroup(TestGroup testGroup) {
        this.testGroup = testGroup;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

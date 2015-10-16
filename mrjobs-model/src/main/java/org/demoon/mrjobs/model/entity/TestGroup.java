package org.demoon.mrjobs.model.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by demoon on 23.09.2015.
 */
@Entity
@Table(name = "testgroup")
public class TestGroup
    extends GenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long        id;
    @Column
    private String      name;
    @Column
    private String      descr;
    @OneToMany
    private List<TestA> testAList;
    @OneToOne
    private Rule        rule;
    @Column
    private int orderId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public List<TestA> getTestAList() {
        return testAList;
    }

    public void setTestAList(List<TestA> testAList) {
        this.testAList = testAList;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}

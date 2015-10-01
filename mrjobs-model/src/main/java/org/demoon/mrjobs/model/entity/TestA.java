package org.demoon.mrjobs.model.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by demoon on 22.09.2015.
 */
@Entity
@Table(name = "testa")
public class TestA
    extends GenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long           id;
    @Column
    private String         name;
    @Column
    private String         descr;
    @OneToMany
    private List<Question> question;
    @OneToOne
    private Rule           rule;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

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

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }
}


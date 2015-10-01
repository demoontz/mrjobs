package org.demoon.mrjobs.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer extends GenEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long    id;
    @Column
    private String  text;
    @Column
    private String  descr;
    @Column
    private boolean isTrueAnswer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public boolean isTrueAnswer() {
        return isTrueAnswer;
    }

    public void setIsTrueAnswer(boolean isTrueAnswer) {
        this.isTrueAnswer = isTrueAnswer;
    }
}

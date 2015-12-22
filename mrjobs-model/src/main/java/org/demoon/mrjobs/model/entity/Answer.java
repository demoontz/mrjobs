package org.demoon.mrjobs.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer extends GenEntity implements Comparable<Answer>{
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
    @Column
    private int orderId;

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

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public int compareTo(Answer o) {
        if (this.orderId < o.orderId) {
            return -1;
        }
        if (this.orderId > o.orderId) {
            return 1;
        }
        return 0;
    }
}

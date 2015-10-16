package org.demoon.mrjobs.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "questions")
public class Question
    extends GenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long         id;
    @Column
    private String       text;
    @Column
    private String       descr;
    @OneToMany
    private List<Answer> answer;
    @Column
    private Long         typeQ;
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

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public Long getTypeQ() {
        return typeQ;
    }

    public void setTypeQ(Long typeQ) {
        this.typeQ = typeQ;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}

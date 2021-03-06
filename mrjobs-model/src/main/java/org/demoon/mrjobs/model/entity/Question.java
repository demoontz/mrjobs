package org.demoon.mrjobs.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "questions")
public class Question
    extends GenEntity implements Comparable<Question>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long         id;
    @Column
    private String       text;
    @Column
    private String       imgUrl;
    @Column
    private String       descr;
    @OneToMany
    private List<Answer> answer;
    @Column
    private Long         typeQ;
    @Column
    private int          orderId;
    @Column
    private String       trueAnsver;
    @Column
    private String       ansverStr;
    @Column
    private Long curentAnsverId;


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

    public Long getCurentAnsverId() {
        return curentAnsverId;
    }

    public void setCurentAnsverId(Long curentAnsverId) {
        this.curentAnsverId = curentAnsverId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTrueAnsver() {
        return trueAnsver;
    }

    public void setTrueAnsver(String trueAnsver) {
        this.trueAnsver = trueAnsver;
    }

    public String getAnsverStr() {
        return ansverStr;
    }

    public void setAnsverStr(String ansverStr) {
        this.ansverStr = ansverStr;
    }

    @Override
    public int compareTo(Question o) {
        if (this.orderId < o.orderId) {
            return -1;
        }
        if (this.orderId > o.orderId) {
            return 1;
        }
        return 0;
    }
}

package org.demoon.mrjobs.model.entity;

import javax.persistence.*;

/**
 * Created by demoon on 10/22/2015.
 */
@Entity
@Table(name = "profecy")
public class Proffecy
    extends GenEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String profecy;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getProfecy() {
        return profecy;
    }

    public void setProfecy(String profecy) {
        this.profecy = profecy;
    }
}

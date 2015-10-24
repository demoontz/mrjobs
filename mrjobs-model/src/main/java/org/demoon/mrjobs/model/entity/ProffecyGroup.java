package org.demoon.mrjobs.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "proffecygroup")
public class ProffecyGroup
    extends GenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

@Column
    private String typeClass;

    @OneToMany
    private List<Proffecy> listProffecy;

    @Column private String keyGroup;
    @Column private String nGroup;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeClass() {
        return typeClass;
    }

    public void setTypeClass(String typeClass) {
        this.typeClass = typeClass;
    }

    public List<Proffecy> getListProffecy() {
        return listProffecy;
    }

    public void setListProffecy(List<Proffecy> listProffecy) {
        this.listProffecy = listProffecy;
    }

    public String getKeyGroup() {
        return keyGroup;
    }

    public void setKeyGroup(String keyGroup) {
        this.keyGroup = keyGroup;
    }

    public String getnGroup() {
        return nGroup;
    }

    public void setnGroup(String nGroup) {
        this.nGroup = nGroup;
    }
}


package org.demoon.mrjobs.model.entity;

import org.demoon.mrjobs.model.enums.Role;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by demoon on 22.09.2015.
 */
@Entity
@Table(name = "users")
public class User
    extends GenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long           id;
    @Column
    private String         email;
    @Column
    private String         pass;
    @Column
    private Role           role;
    @Column
    private String name;
    @Column
    private Date bdate;
    @OneToMany
    private List<PassTest> passTestList;


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<PassTest> getPassTestList() {
        return passTestList;
    }

    public void setPassTestList(List<PassTest> passTestList) {
        this.passTestList = passTestList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }
}

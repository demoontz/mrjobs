package org.demoon.mrjobs.model.entity;


import lombok.Getter;
import lombok.Setter;

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
    @Getter @Setter
    private Long           id;
    @Getter @Setter
    @Column(unique = true)
    private String         email;
    @Getter @Setter
    private String         pass;
    @Getter @Setter
    private String           role;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private Date bdate;
    @OneToMany(cascade = {CascadeType.ALL})
    @Getter @Setter
    private List<PassTest> passTestList;

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", email='" + email + '\'' +
            ", pass='" + pass + '\'' +
            ", role='" + role + '\'' +
            ", name='" + name + '\'' +
            ", bdate=" + bdate +
            ", passTestList=" + passTestList +
            '}';
    }
}

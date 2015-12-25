package org.demoon.mrjobs.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by demoon on 23.09.2015.
 */
@Entity
@Table(name = "passtest")
public class PassTest
    extends GenEntity {

    @Id @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Getter @Setter
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Gotans> gotansesList;
    @Getter @Setter
    private String test1result1;
    @Getter @Setter
    private String test1result2;
    @Getter @Setter
    private String test2result;
    @Getter @Setter
    private String test3result;
    @Getter @Setter
    private Date date;

    @Getter @Setter
    private Long userid;
    @Getter @Setter
    private Long testid;

}

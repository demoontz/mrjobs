package org.demoon.mrjobs.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by demoon on 23.09.2015.
 */
@Entity
@Table(name = "gotans")
public class Gotans extends GenEntity {

    @Id @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Getter @Setter
    private Long   question_id;
    @Getter @Setter
    private Long curentAnsverId;
    @Getter @Setter
    private String ansverStr;

    public Gotans(Long question_id, Long curentAnsverId, String ansverStr) {
        this.question_id=question_id;
        this.curentAnsverId=curentAnsverId;
        this.ansverStr=ansverStr;
    }

    public Gotans() {
    }
}

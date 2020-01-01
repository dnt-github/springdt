package com.truong.springDT.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter @Setter
@ToString

public class Comment extends Auditable{
    @Id
    @GeneratedValue
    private Long id;
    private String body;
    public Comment(){}

    @ManyToOne
    private Link link;

    public Comment(String body, Link link){
        this.link=link;
        this.body=body;
    }


}

package com.truong.springDT.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity

@Getter
@Setter
@ToString

public class Link extends Auditable {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;
    public Link(){}

    @OneToMany(mappedBy = "link")
    private List<Comment> comments= new ArrayList<>();

    public Link(String title, String url) {
        this.title=title;
        this.url=url;
    }
    public void addComment(Comment comment){
        comments.add(comment);
    }

}

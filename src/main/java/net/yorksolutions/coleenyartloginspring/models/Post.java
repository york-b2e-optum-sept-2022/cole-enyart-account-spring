package net.yorksolutions.coleenyartloginspring.models;

import javax.persistence.*;

@Entity
public class Post {
    public String text;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;

//    public Post(Post post) {
//    }
}

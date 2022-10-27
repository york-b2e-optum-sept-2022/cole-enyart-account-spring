package net.yorksolutions.coleenyartloginspring.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Account {
    public String email;
    public String password;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;

    @OneToMany
    public Set<Post> posts;
}

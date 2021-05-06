package com.example.demo.models;

import javax.persistence.*;
import java.util.List;

//Create a User class, with (at least) fields for
// id, username, email, and password.

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;


//  In your User and Post classes, define the post - user relationship.
//  One user to many posts
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Post> posts;


//  empty listener
    public User() {

    }

    public User(long id, String email, String username, String password, List<Post> posts) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(User copy) {
        this.id = copy.id;
        this.email = copy.email;
        this.username = copy.username;
        this.password = copy.password;
        this.posts = copy.posts;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public List<Post> getPosts() {

        return posts;
    }

    public void setPosts(List<Post> posts) {

        this.posts = posts;
    }
}
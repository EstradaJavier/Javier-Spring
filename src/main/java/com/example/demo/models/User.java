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


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Post> posts;



    public User() {
    }

    public User(long id, String email, String username, String password, List<Post> posts) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // implement the Copy Constructor right here in the User model!
    // We can call on this constructor from elsewhere in our code, and don't have to specify
    // all of the User object's properties (like email, username, etc)
    public User(User copy) {
        this.id = copy.id; // VERY IMPORTANT. Many things won't work if you don't include this assignment
        this.email = copy.email;
        this.username = copy.username;
        this.password = copy.password;
        this.posts = copy.posts;

        // It's like the Abed from the Darkest Timeline, and normal Abed (Community - it's on Netflix. Watch it)
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
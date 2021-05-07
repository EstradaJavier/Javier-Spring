package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "ads")
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    public Ad() {

    }

    public long getId() {

        return id;
    }

    public String getTitle() {

        return title;
    }

    public String getDescription() {

        return description;
    }

    public int getPriceInCents() {

        return priceInCents;
    }

    public void setId(long id) {

        this.id = id;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public void setPriceInCents(int priceInCents) {

        this.priceInCents = priceInCents;
    }

    public Ad(long id, String title, String description, int priceInCents) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priceInCents = priceInCents;
    }

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private int priceInCents;

}


package com.example.demo.models;

import javax.persistence.*;

@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public int getChipID() {
        return chipID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getResideState() {
        return resideState;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setChipID(int chipID) {
        this.chipID = chipID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setResideState(String resideState) {
        this.resideState = resideState;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Dog(long id, int chipID, String name, int age, String resideState, String description) {
        this.id = id;
        this.chipID = chipID;
        this.name = name;
        this.age = age;
        this.resideState = resideState;
        this.description = description;
    }

    @Column(nullable = false)
    private int chipID;
    private String name;
    private int age;
    private String resideState;
    private String description;
}

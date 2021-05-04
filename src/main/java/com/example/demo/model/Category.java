package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "/itemsCategory")
public class Category {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "picture")
    private String picture;

    public Category() {

    }

    public Category(String name, String picture) {
        this.name = name;
        this.picture = picture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}

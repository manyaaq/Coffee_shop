package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "/Items_1")
public class Item {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "description", nullable = false, unique = true)
    private String description;

    @Column(name = "weight", nullable = false)
    private String weight;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "picture")
    private String picture;

    @ManyToOne
    @JoinColumn(name = "category", nullable = false)
    private String category;

    @Column (name = "discount",nullable = false)
    private Double discount;

    public Item() {

    }

    public Item(String name, String description, String weight, Double price, String picture, String category, Double discount) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.price = price;
        this.picture = picture;
        this.category = category;
        this.discount = discount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", weight='" + weight + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                ", category='" + category + '\'' +
                ", discount=" + discount +
                '}';
    }

    public void setPicture(String picture) {
        this.picture = picture;

    }
}

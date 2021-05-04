package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "orderItem")
public class OrderItem {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "order_id",insertable = false,updatable = false)
    private Order order;

    @Column(name = "quantity")
    private String quantity;

    public OrderItem() {

    }

    public OrderItem(Item item, Order order, String quantity) {
        this.item = item;
        this.order = order;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", item=" + item +
                ", order=" + order +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}

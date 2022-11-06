package com.kapelet.kapeletrestaurantapp.model;

import javax.persistence.*;

@Entity
@Table(name = "order_products")
public class OrderProduct {
    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;
    int quantity;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public Product getProduct() { return product; }

    public void setProduct(Product product) { this.product = product; }
}

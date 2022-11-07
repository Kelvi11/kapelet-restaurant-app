package com.kapelet.kapeletrestaurantapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    private int id;
    private String listProducts;
    private Double total;
    private OrderStatus status;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getListProducts() { return this.listProducts; }

    public void setListProducts(String listProducts) { this.listProducts = listProducts; }

    public Double getTotal() { return total; }

    public void setTotal(Double total) { this.total = total; }

    public OrderStatus getStatus() { return status; }

    public void setStatus(OrderStatus status) { this.status = status; }
}

package com.kapelet.kapeletrestaurantapp.repository;

import com.kapelet.kapeletrestaurantapp.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    public List<Product> getAll(){

        Product beer = new Product();
        beer.setName("Beer");
        beer.setPrice(1.2);

        Product cola = new Product();
        cola.setName("Cola");
        cola.setPrice(2.2);

        Product water = new Product();
        water.setName("Water");
        water.setPrice(0.2);

        return List.of(beer, cola, water);
    }
}

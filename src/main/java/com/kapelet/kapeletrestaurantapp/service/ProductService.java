package com.kapelet.kapeletrestaurantapp.service;

import com.kapelet.kapeletrestaurantapp.model.Product;
import com.kapelet.kapeletrestaurantapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.getAll();
    }
}

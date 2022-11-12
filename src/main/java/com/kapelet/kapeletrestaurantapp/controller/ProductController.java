package com.kapelet.kapeletrestaurantapp.controller;

import com.kapelet.kapeletrestaurantapp.model.Product;
import com.kapelet.kapeletrestaurantapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity getAll() {
        return ResponseEntity.ok(productService.getAll());
    }

    @PostMapping
    public Product persist(@RequestBody Product product) {
        return productService.persist(product);
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) {
        return productService.getById(id);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Integer id, @RequestBody Product product) {
        return productService.update(id, product);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        productService.deleteById(id);
        return "U fshi me suksess!";
    }
}

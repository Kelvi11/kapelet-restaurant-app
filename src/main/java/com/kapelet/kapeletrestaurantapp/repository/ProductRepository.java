package com.kapelet.kapeletrestaurantapp.repository;

import com.kapelet.kapeletrestaurantapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}

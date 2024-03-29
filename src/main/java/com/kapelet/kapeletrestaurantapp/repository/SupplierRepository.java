package com.kapelet.kapeletrestaurantapp.repository;

import com.kapelet.kapeletrestaurantapp.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}

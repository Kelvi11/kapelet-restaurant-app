package com.kapelet.kapeletrestaurantapp.controller;

import com.kapelet.kapeletrestaurantapp.model.Supplier;
import com.kapelet.kapeletrestaurantapp.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")

public class SupplierController {
    @Autowired
    SupplierService supplierService;

    @GetMapping
    public ResponseEntity getAll() {
        return ResponseEntity.ok(supplierService.getAll());
    }

    @PostMapping
    public ResponseEntity<Supplier> persist(@RequestBody Supplier supplier) {
        return ResponseEntity.ok(supplierService.persist(supplier));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Supplier> getById(@PathVariable int id) {
        return ResponseEntity.ok(supplierService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Supplier> update(@PathVariable int id, @RequestBody Supplier supplier) {
        return ResponseEntity.ok(supplierService.update(id, supplier));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id) {
        supplierService.deleteById(id);
        return ResponseEntity.ok("Delete successfully!");

    }

}

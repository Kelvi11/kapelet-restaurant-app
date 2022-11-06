package com.kapelet.kapeletrestaurantapp.controller;

import com.kapelet.kapeletrestaurantapp.model.Supplier;
import com.kapelet.kapeletrestaurantapp.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")

public class SupplierController {
    @Autowired
    SupplierService supplierService;

    @GetMapping
    public List<Supplier> getAll() {
        return supplierService.getAll();
    }

    @PostMapping
    public Supplier persist(@RequestBody Supplier supplier) {
        return supplierService.persist(supplier);
    }

    @GetMapping("/{id}")
    public Supplier getById(@PathVariable int id) {
        return supplierService.getById(id);
    }

    @PutMapping("/{id}")
    public Supplier update(@PathVariable int id, @RequestBody Supplier supplier) {
        return supplierService.update(id, supplier);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        supplierService.deleteById(id);
        return "Delete successfully!";

    }

}

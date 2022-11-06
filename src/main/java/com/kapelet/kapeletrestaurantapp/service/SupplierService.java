package com.kapelet.kapeletrestaurantapp.service;

import com.kapelet.kapeletrestaurantapp.model.Supplier;
import com.kapelet.kapeletrestaurantapp.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {
    @Autowired
    SupplierRepository supplierRepository;

    public List<Supplier> getAll() {
        return supplierRepository.findAll();
    }

    public Supplier persist(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    public Supplier getById(int id) {
        Optional<Supplier> supplierOptional = supplierRepository.findById(id);
        if(supplierOptional.isPresent()){
            return supplierOptional.get();
        }
        return null;
    }

    public Supplier update(int id, Supplier supplier) {
        Optional<Supplier> supplierOptional = supplierRepository.findById(id);
        if (supplierOptional.isPresent()) {
            Supplier existingSupplier = supplierOptional.get();
            existingSupplier.setName(supplier.getName());
            existingSupplier.setContactPerson(supplier.getContactPerson());
            existingSupplier.setContactNumber(supplier.getContactNumber());
        }
        return supplierRepository.save(supplier);
    }

    public void deleteById(int id) {
        supplierRepository.deleteById(id);
    }
}

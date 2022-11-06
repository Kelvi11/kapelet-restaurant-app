package com.kapelet.kapeletrestaurantapp.service;

import com.kapelet.kapeletrestaurantapp.model.OrderProduct;
import com.kapelet.kapeletrestaurantapp.repository.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderProductService {

    @Autowired
    OrderProductRepository orderProductRepository;

    public List<OrderProduct> getAll() {
        return orderProductRepository.findAll();
    }

    public OrderProduct persist(OrderProduct orderProduct) {
        return orderProductRepository.save(orderProduct);
    }

    public OrderProduct getbyId(int id) {
        Optional<OrderProduct> orderProductOptional = orderProductRepository.findById(id);
        if (orderProductOptional.isPresent()) {
            return orderProductOptional.get();
        }
        return null;
    }

    public OrderProduct update(Integer id, OrderProduct orderProduct) {
        Optional<OrderProduct> orderProductOptional = orderProductRepository.findById(id);
        if (orderProductOptional.isPresent()) {
            OrderProduct existingOrderProduct = orderProductOptional.get();
            existingOrderProduct.setId(orderProduct.getId());
            existingOrderProduct.setProduct(orderProduct.getProduct());
            existingOrderProduct.setQuantity(orderProduct.getQuantity());
        }

        return orderProductRepository.save(orderProduct);
    }

    public void deletebyId(int id) {
        orderProductRepository.deleteById(id);
    }
}

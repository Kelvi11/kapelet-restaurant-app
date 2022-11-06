package com.kapelet.kapeletrestaurantapp.service;

import com.kapelet.kapeletrestaurantapp.model.Order;
import com.kapelet.kapeletrestaurantapp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order> getAll() { return orderRepository.findAll(); }

    public Order persist(Order order) {
        return orderRepository.save(order);
    }

    public Order getById(Integer id) {
        Optional<Order> orderOptional = orderRepository.findById(id);
        if(orderOptional.isPresent()){
            return orderOptional.get();
        }
        return null;
    }

    public Order update(Integer id, Order order) {
        Optional<Order> orderOptional = orderRepository.findById(id);

        if (orderOptional.isPresent()) {
            Order existingOrder = orderOptional.get();
            existingOrder.setListProducts(order.getListProducts());
            existingOrder.setTotal(order.getTotal());
            existingOrder.setStatus(order.getStatus());
        }
        return orderRepository.save(order);
    }

    public void deleteById(Integer id) { orderRepository.deleteById(id); }
}

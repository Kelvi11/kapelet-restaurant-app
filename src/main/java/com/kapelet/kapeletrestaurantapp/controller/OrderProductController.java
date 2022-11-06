package com.kapelet.kapeletrestaurantapp.controller;

import com.kapelet.kapeletrestaurantapp.model.OrderProduct;
import com.kapelet.kapeletrestaurantapp.service.OrderProductService;
import com.kapelet.kapeletrestaurantapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order_products")
public class OrderProductController {

    @Autowired
    OrderProductService orderProductService;

    @GetMapping
    public List<OrderProduct> getAll() {
        return orderProductService.getAll();
    }

    @PostMapping
    public OrderProduct persist(@RequestBody OrderProduct orderProduct) {
        return orderProductService.persist(orderProduct);
    }

    @GetMapping("/{id}")
    public OrderProduct getbyId(@PathVariable Integer id) {
        return orderProductService.getbyId(id);
    }

    @PutMapping("/{id}")
    public OrderProduct update(@PathVariable Integer id, @RequestBody OrderProduct orderProduct){
        return orderProductService.update(id,orderProduct);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id){
        orderProductService.deletebyId(id);
        return "Delete successfully!";
    }
}

package com.kapelet.kapeletrestaurantapp.controller;

import com.kapelet.kapeletrestaurantapp.model.Client;
import com.kapelet.kapeletrestaurantapp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping
    public List<Client> getAll(){return clientService.getAll(); }

    @PostMapping
    public Client getById(@RequestBody Client client){return clientService.persist(client); }

    @GetMapping("/{id}")
    public Client getById(@PathVariable Integer id){ return clientService.getById(id); }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        clientService.deleteById(id);
        return "U fshi me sukses!";
    }

}
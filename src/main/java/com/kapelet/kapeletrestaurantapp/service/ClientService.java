package com.kapelet.kapeletrestaurantapp.service;

import com.kapelet.kapeletrestaurantapp.model.Client;
import com.kapelet.kapeletrestaurantapp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAll() { return clientRepository.findAll(); }

    public Client persist(Client client){
        return clientRepository.save(client);
    }

    public Client getById(int id){
        Optional<Client> clientOptional = clientRepository.findById(id);
        if (clientOptional.isPresent()) {
          return clientOptional.get();
        }
        return null;
    }

    public Client update(Integer id, Client client) {
        Optional<Client> clientOptional = clientRepository.findById(id);

        if(clientOptional.isPresent()){
            Client existingClient = clientOptional.get();
            existingClient.setName(client.getName());
            existingClient.setSurname(client.getSurname());
        }

        return clientRepository.save(client);
    }

    public void deleteById(int id) { clientRepository.deleteById(id); }
}

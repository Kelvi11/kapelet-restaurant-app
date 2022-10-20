package com.kapelet.kapeletrestaurantapp.repository;

import com.kapelet.kapeletrestaurantapp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}

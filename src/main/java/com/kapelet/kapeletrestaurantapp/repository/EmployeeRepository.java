package com.kapelet.kapeletrestaurantapp.repository;

import com.kapelet.kapeletrestaurantapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

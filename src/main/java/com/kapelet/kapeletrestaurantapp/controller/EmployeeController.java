package com.kapelet.kapeletrestaurantapp.controller;

import com.kapelet.kapeletrestaurantapp.model.Employee;
import com.kapelet.kapeletrestaurantapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ResponseEntity getAll() {
        return ResponseEntity.ok(employeeService.getAll());
    }

    @PostMapping
    public ResponseEntity<Employee> persist(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.persist(employee));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getById(@PathVariable int id) {
        return ResponseEntity.ok(employeeService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> update(@PathVariable int id, @RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.update(id, employee));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id) {
        employeeService.deleteById(id);
        return ResponseEntity.ok("Delete successfully!");
    }
}

package org.purgatory.dockerpostgresspringboot.rest.controller;

import java.net.URI;
import java.time.LocalDate;

import org.purgatory.dockerpostgresspringboot.persistence.entity.EEmployee;
import org.purgatory.dockerpostgresspringboot.persistence.repository.EmployeeRepository;
import org.purgatory.dockerpostgresspringboot.rest.model.Employee;
import org.purgatory.dockerpostgresspringboot.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class EmployeeController {

  @Autowired
  EmployeeRepository employeeRepository;

  @GetMapping("{email}")
  public ResponseEntity<?> authenticate(@PathVariable String email) {

    return ResponseEntity.ok(employeeRepository.findByEmail(email));
  }

  @PostMapping
  public ResponseEntity<?> register(@RequestBody Employee request){
    employeeRepository.save(EEmployee.builder()
            .email(request.getEmail())
            .firstName(request.getFirstName())
            .lastName(request.getLastName())
            .salary(request.getSalary())
            .department(request.getDepartment())
            .position(request.getPosition())
            .hireDate(LocalDate.now())
            .build());
    return ResponseEntity.created(URI.create("/api/employee")).build();
  }
}

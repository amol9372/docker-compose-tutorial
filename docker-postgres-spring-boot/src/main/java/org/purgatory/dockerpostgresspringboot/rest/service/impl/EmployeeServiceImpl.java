package org.purgatory.dockerpostgresspringboot.rest.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.purgatory.dockerpostgresspringboot.persistence.entity.EEmployee;
import org.purgatory.dockerpostgresspringboot.persistence.repository.EmployeeRepository;
import org.purgatory.dockerpostgresspringboot.rest.model.Employee;
import org.purgatory.dockerpostgresspringboot.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired EmployeeRepository employeeRepository;

  @Override
  public EEmployee getEmployee(String email) {
    return employeeRepository.findByEmail(email).orElseThrow();
  }

  @Override
  public void addEmployee(Employee request) {
    employeeRepository.save(
        EEmployee.builder()
            .email(request.getEmail())
            .firstName(request.getFirstName())
            .lastName(request.getLastName())
            .salary(request.getSalary())
            .department(request.getDepartment())
            .position(request.getPosition())
            .hireDate(LocalDate.now())
            .build());
  }
}
